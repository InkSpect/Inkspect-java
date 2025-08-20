package com.github.inkspect.java_cli.domain.queries.spring_boot

import io.shiftleft.semanticcpg.language.*
import io.joern.console.*
import io.joern.macros.QueryMacros.*
import io.joern.dataflowengineoss.language.*
import io.joern.dataflowengineoss.queryengine.EngineContext
import org.checkerframework.checker.units.qual.s

object SpringBootCSRF extends QueryBundle {

    implicit val resolver: ICallResolver = NoResolve

    @q
    def csrfDisableAll()(implicit context: EngineContext): Query =
        Query.make(
            name = "IS-JAVA-0001",
            author = "kchak",
            title = "CSRF disabled",
            description = """
                | Disabling CSRF protection completely leaves your application vulnerable to cross-site request forgery.
                |""".stripMargin,
            score = 7,
            withStrRep({ cpg =>
                cpg.call
                    .nameExact("disable")
                    .where(_.argument(0).isIdentifier.nameExact("csrf"))
            }),
            codeExamples = CodeExamples(
                positive = List(
                """
                |@Configuration
                |@EnableWebSecurity
                |public class SecurityConfiguration {
                |  @Bean
                |  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
                |    http.csrf(csrf -> {
                |      csrf.disable();
                |    });
                |    return http.build();
                |  }
                |}
                |""".stripMargin
                ),
                negative = List(
                """
                |@Configuration
                |@EnableWebSecurity
                |public class SecurityConfiguration {
                |  @Bean
                |  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
                |    http.csrf(csrf -> {
                |      csrf.ignoringRequestMatchers("/api");
                |    });
                |    return http.build();
                |  }
                |}
                |""".stripMargin
                )
            )
        )

    @q
    def securityFilterChainAbsent()(implicit context: EngineContext): Query =
        Query.make(
            name        = "IS-JAVA-0002",
            author      = "kchak",
            title       = "Missing SecurityFilterChain",
            description = """
                |This query checks that no method returns a `SecurityFilterChain`.
                |If not, the application is not protected by Spring Security.
                |""".stripMargin,
            score       = 1,
            withStrRep({ cpg =>
                val sfcMethods = cpg.method.where(_.methodReturn.typeFullName(".*SecurityFilterChain.*"))
                cpg.metaData.filter(_ => sfcMethods.isEmpty)
            }),
            codeExamples = CodeExamples(
                positive = List(
                """
                |class AppConfig {
                |  def someOtherBean(): AnyRef = ???
                |}
                |""".stripMargin
                ),
                negative = List(
                """
                |@Configuration
                |@EnableWebSecurity
                |class SecurityConfiguration {
                |  @Bean
                |  def securityFilterChain(http: HttpSecurity): SecurityFilterChain = {
                |    http.build()
                |  }
                |}
                |""".stripMargin
                )
            )
        )
}

