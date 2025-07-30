class Foo {

    void myMethod(int x) { }

    void myDangerousMethod(int x) {
        try {
            Runtime.getRuntime().exec("ls");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
