class A {
    void f1() {
        System.out.println("No Parameters - Overloading");
    }
}

class B extends A {
    void f1(int x) {
        System.out.println("With Parameters - Overloading " + x);
    }
}

public class fifteenth {
    static void demo() {
        System.out.println("No Paramming - Overloading");
    }

    static void demo(int x) {
        System.out.println("With Paramming - Overloading " + x);
    }

    void func() {
        System.out.println("No Params - Overloading");
    }

    void func(int x) {
        System.out.println("With Params - Overloading " + x);
    }

    public static void main(String[] args) {
        System.out.println("OVERLOADING");

        B b = new B();
        b.f1(5);
        b.f1();

        fifteenth f = new fifteenth();
        f.func();
        f.func(9);

        demo();
        demo(2);
    }
}