class A {
    int z = 2;

    void func() {
        System.out.println("I am something");
    }
}

class B extends A {
    int z = 5;

    void func() {
        int z = 4;
        System.out.println("Hey buddy : " + z);
        System.out.println("Hey buddy : " + this.z);
        System.out.println("Hey buddy : " + super.z);
        super.func();
    }
}

public class eighteenth {
    public static void main(String[] args) {
        B obj = new B();
        obj.func();
    }
}