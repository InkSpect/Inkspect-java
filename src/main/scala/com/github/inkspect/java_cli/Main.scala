package com.github.inkspect.java_cli

import com.github.inkspect.java_cli.infrastructure.cli.{CommandLineOptions, CommandLineConfiguration}
import com.github.inkspect.java_cli.application.usecases.AnalyzeSourceCodeUseCase

object Main {
  def main(args: Array[String]): Unit = {
    CommandLineConfiguration.parse(args) match {
      case Some(options) =>
        AnalyzeSourceCodeUseCase().execute(sourcePath = options.src, jdkPath = options.jdkPath)
      case None =>
        // arguments are bad, error message will have been displayed
        sys.exit(1)
    }
  }
}
