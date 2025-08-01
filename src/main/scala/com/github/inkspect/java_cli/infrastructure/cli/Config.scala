package com.github.inkspect.java_cli.infrastructure.cli

import scopt.OParser

case class CommandLineOptions(
  src: String = "",
  verbose: Boolean = false,
  command: String = "scan"
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
        
      cmd("scan")
        .action((_, c) => c.copy(command = "scan"))
        .text("Scan Java source code"),
        
      help("help").text("Show this help message"),
      version("version").text("Show version information")
    )
  }
  
  def parse(args: Array[String]): Option[CommandLineOptions] = {
    OParser.parse(parser, args, CommandLineOptions())
  }
}
