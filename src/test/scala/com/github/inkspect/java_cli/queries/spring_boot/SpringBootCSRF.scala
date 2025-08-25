package com.github.inkspect.java

import com.github.inkspect.java_cli.domain.queries.spring_boot.SpringBootCSRF
import io.joern.console.scan.{ScanPass, outputFindings}
import io.joern.dataflowengineoss.queryengine.EngineContext
import io.joern.javasrc2cpg.{Config, JavaSrc2Cpg}
import io.joern.x2cpg.X2Cpg.applyDefaultOverlays
import io.shiftleft.semanticcpg.language._

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

import java.io.{ByteArrayOutputStream, PrintStream}
import scala.util.{Failure, Success}

class TestSpringBootCSRF extends AnyWordSpec with Matchers {

    "csrfAll" should {

        "Report a disable() of CSRF" in {
            val joernConfig = Config().withInputPath("src/test/java_file")
            val cpgOrException = JavaSrc2Cpg().createCpg(joernConfig)

            cpgOrException match {
                case Success(cpg) =>
                applyDefaultOverlays(cpg)
                val queries = List(SpringBootCSRF.csrfDisableAll()(EngineContext()))
                new ScanPass(cpg, queries).createAndApply()
                val findings = cpg.finding.l
                assert(findings.nonEmpty, "Nothing has been detected")

                val baos = new ByteArrayOutputStream()
                Console.withOut(new PrintStream(baos)) {
                    outputFindings(cpg)
                }

                val printed = baos.toString.trim
                val expected = "Result: 7.0 : CSRF disabled: CSRFFileTest.java:13:SecurityConfiguration.<lambda>0:<unresolvedSignature>(1)"
                assert(printed == expected.trim, "csrf.disabled() hasn't been detected")                
                case Failure(exception) =>
                                println("[FAILED]")
                                println(exception)
                                sys.exit(1)
                    }
        }

        "Report the missing of SecurityFilterChain" in {
            val joernConfig = Config().withInputPath("src/test/java_file/CSRFmisFileTest")
            val cpgOrException = JavaSrc2Cpg().createCpg(joernConfig)

            cpgOrException match {
                case Success(cpg) =>
                applyDefaultOverlays(cpg)
                val queries = List(SpringBootCSRF.securityFilterChainAbsent()(EngineContext()))
                new ScanPass(cpg, queries).createAndApply()
                val findings = cpg.finding.l
                assert(findings.nonEmpty, "Nothing has been detected")
                val baos = new ByteArrayOutputStream()
                Console.withOut(new PrintStream(baos)) {
                    outputFindings(cpg)
                }

                val printed = baos.toString.trim
                val expected = "Result: 1.0 : Missing SecurityFilterChain: N/A:0:<empty>"
                assert(printed == expected.trim, "The missing of SecurityFilterChain hasn't been detected")           
                case Failure(exception) =>
                                println("[FAILED]")
                                println(exception)
                                sys.exit(1)
                    }
        }
    }
}