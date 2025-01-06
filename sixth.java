public class sixth {
    static void funcTest() {
        System.out.println("Without parameters");
    }

    static void funcTest(int x) {
        System.out.println("With one parameters : " + x);
    }

    static void funcTest(int x, int y) {
        System.out.println("With two parameters : " + (x + y));
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        // POLYMORPHISM - FUNCTION OVERLOADING

        funcTest();
        funcTest(2);
        funcTest(3, 4);

    }
}
