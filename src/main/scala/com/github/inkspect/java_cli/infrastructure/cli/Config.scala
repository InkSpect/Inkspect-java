package com.github.inkspect.java_cli.infrastructure.cli

import scopt.OParser

case class CommandLineOptions(
  src: String = "",
  verbose: Boolean = false,
  jdkPath: String = sys.env.getOrElse("JAVA_HOME", "")
)

object CommandLineConfiguration {
  def parser: OParser[Unit, CommandLineOptions] = {
    val builder = OParser.builder[CommandLineOptions]
    import builder._

    OParser.sequence(
      programName("inkspect"),
      head("InkSpect"),
      opt[String]('s', "source")
        .required()
        .action((x, c) => c.copy(src = x))
        .text("source code directory to analyze"),
      opt[String]('j', "jdk-path")
        .action((x, c) => c.copy(jdkPath = x))
        .text(s"JDK path for type resolution (default: ${sys.env.getOrElse("JAVA_HOME", "system default")})"),
      help("help").text("Show this help message"),
      version("version").text("Show version information")
    )
  }

  def parse(args: Array[String]): Option[CommandLineOptions] = {
    OParser.parse(parser, args, CommandLineOptions())
  }
}
