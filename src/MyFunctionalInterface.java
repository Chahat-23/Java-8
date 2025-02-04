public interface MyFunctionalInterface {
    void m1();

    default void m2() {
        System.out.println("default method");
    }

    static void m3() {
        System.out.println("static method");
    }
}
