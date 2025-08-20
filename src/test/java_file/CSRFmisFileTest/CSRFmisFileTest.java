package demo;

class HttpSecurity {
  CsrfConfigurer csrf(java.util.function.Consumer<CsrfConfigurer> c) {
    CsrfConfigurer cfg = new CsrfConfigurer();
    c.accept(cfg);
    return cfg;
  }
}
