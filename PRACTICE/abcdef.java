class Example {
    public static int a = 5;

    public void action() {
        System.out.println(a);
    }

    public static void func() {
        System.out.println("Hello " + a);
    }

    static class innerClass {
        public static void dear() {
            System.out.println("Dear");
        }
    }
}

public class abcdef {
    static{
        System.out.println("First Program");
    }
    public static void main(String[] args) {
        System.out.println(Example.a);
        Example e = new Example();
        e.action();
        Example.func();
        Example.innerClass.dear();
    }
}