# InkSpect-java

InkSpect for Java

InkSpect is a prototype Static Application Security Testing (SAST) tool built on **[Joern](https://github.com/joernio/joern)**, focused on Java.  
**Status:** Prototype ; not yet operational.
It offers Taint Analysis based on a Code Property Graph.
Please build once before modifying the code.


## Install

- [Installation guide for Linux](doc/install/install-linux.md)
- [Installation guide for MacOS](doc/install/install-macos.md)

## Usage

```
./inkspect-java --help
```

Options:
```
-s, --source <value>    source code directory to analyze
-j, --jdk-path <value>  JDK path for type resolution (default: $JAVA_HOME)
--help                  Show this help message
--version               Show version information
```

## Contribute

### Prerequisite

Install development tools:
- sbt
- GraalVM CE 21 (For Native Image support) or OpenJDK 21

Or enable Flake for Nix environment:

```bash
direnv allow
```

### Build

#### Native Image

- Update configuration for Reflection

```
java -agentlib:native-image-agent=config-output-dir=native-image-configs \
    -cp "$(sbt 'export fullClasspath' | tail -n1)" \
    com.github.inkspect.java_cli.Main -s testprogram/
```

- Build Native Image

```
sbt clean compile graalvm-native-image:packageBin
```

### Universal Package

- Build

```
sbt clean stage
```

### Run

#### Run Nagive Image

```
./target/graalvm-native-image/java_cli -s testprogram/
```

#### Run Java App Packaging


- Run CLI (Command Line Interface)

```
./inkspect_java_cli -s testprogram/
```

- Run REPL (Read-Eval-Print-Loop) for interactive usage

```
./inkspect_java_repl
```
