package com.github.inkspect.java_cli

import io.joern.javasrc2cpg.{Config, JavaSrc2Cpg}
import io.joern.x2cpg.X2Cpg.applyDefaultOverlays
import io.shiftleft.codepropertygraph.generated.Cpg
import io.shiftleft.codepropertygraph.generated.nodes.NewMynodetype
import io.shiftleft.passes.CpgPass
import io.shiftleft.semanticcpg.language._
import flatgraph.DiffGraphBuilder
import scala.util.{Failure, Success}
import io.joern.console.QueryBundle
import io.joern.console.scan.ScanPass
import io.joern.console.scan.outputFindings

import com.github.inkspect.java_cli.DangerousFunctions
import com.github.inkspect.java_cli.infrastructure.cli.{CommandLineOptions, CommandLineConfiguration}

object Main {

  def main(args: Array[String]): Unit = {
    CommandLineConfiguration.parse(args) match {
      case Some(options) =>
        runAnalysis(options.src)
      case None =>
        // arguments are bad, error message will have been displayed
        sys.exit(1)
    }
  }

  private def runAnalysis(src: String): Unit = {
    println("Hello Joern")
    println(s"Analyzing: ${src}")

    print("Creating CPG... ")
    val joernConfig    = Config().withInputPath(src)
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
        println("Checking for dangerous function calls...")

        val queries = List(DangerousFunctions.execUsed())
        new ScanPass(cpg, queries).createAndApply()
        outputFindings(cpg)

      case Failure(exception) =>
        println("[FAILED]")
        println(exception)
        sys.exit(1)
    }
  }

}
