public class eighth {
    int x, y;

    eighth() {
        x = 5;
        System.out.println("Default Constructor");
    }

    eighth(int a, int b) {
        x = a;
        y = b;
        System.out.println("Parameterized Constructor");
    }

    public static void main(String[] args) {
        eighth myObj1 = new eighth();
        System.out.println(myObj1.x);

        eighth myObj2 = new eighth(2, 5);
        System.out.println(myObj2.x + myObj2.y);

    }
}
