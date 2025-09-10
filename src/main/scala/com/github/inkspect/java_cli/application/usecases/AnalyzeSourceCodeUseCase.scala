package com.github.inkspect.java_cli.application.usecases

import io.joern.console.scan.outputFindings
import io.joern.console.scan.ScanPass
import io.joern.javasrc2cpg.{Config, JavaSrc2Cpg}
import io.joern.x2cpg.X2Cpg.applyDefaultOverlays
import io.shiftleft.semanticcpg.language._
import scala.util.{Failure, Success}

import com.github.inkspect.java_cli.domain.queries.DangerousFunctions
import com.github.inkspect.java_cli.domain.queries.spring_boot.SpringBootCSRF
import io.joern.dataflowengineoss.queryengine.EngineContext


class AnalyzeSourceCodeUseCase() {
  def execute(sourcePath: String, jdkPath: String): Unit = {
    println("Hello Joern")
    println(s"Analyzing: ${sourcePath}")

    print("Creating CPG... ")
    val joernConfig    = Config().withInputPath(sourcePath).withJdkPath(jdkPath)
    val cpgOrException = JavaSrc2Cpg().createCpg(joernConfig)

    cpgOrException match {
      case Success(cpg) =>
        println("[DONE]")
        println("Applying default overlays")
        applyDefaultOverlays(cpg)

        println("Printing all methods:")
        println("=====================")
        cpg.method.name.foreach(println)
        println("=====================")

        // Security analysis
        println("Running security analysis...")

        val context: EngineContext = EngineContext()
        val queries = List(DangerousFunctions.execUsed(), SpringBootCSRF.csrfDisableAll()(context))
        new ScanPass(cpg, queries).createAndApply()
        outputFindings(cpg)

      case Failure(exception) =>
        println("[FAILED]")
        println(exception)
        sys.exit(1)
    }
  }
}
