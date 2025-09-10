# InkSpect-java

InkSpect for Java

InkSpect is a prototype Static Application Security Testing (SAST) tool built on **[Joern](https://github.com/joernio/joern)**, focused on Java.  
**Status:** Prototype ; not yet operational.
It offers Taint Analysis based on a Code Property Graph.
Please build once before modifying the code.

## Prerequisite

Install development tools:
- sbt
- java 

Or enable Flake for Nix environment:

```bash
direnv allow
```

## Build

```
sbt clean stage
```

## Run

- Run CLI (Command Line Interface)

```
./inkspect_java_cli -s testprogram/
```

- Run REPL (Read-Eval-Print-Loop) for interactive usage

```
./inkspect_java_repl
```

# Options

```
-s, --source <value>    source code directory to analyze
-j, --jdk-path <value>  JDK path for type resolution (default: $JAVA_HOME)
--help                  Show this help message
--version               Show version information
```
