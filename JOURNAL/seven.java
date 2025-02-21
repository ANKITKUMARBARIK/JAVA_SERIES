class Overload {
    void display(int num) {
        System.out.println("One integer : " + num);
    }

    void display(int num1, int num2) {
        System.out.println("Two integers : " + num1 + " and " + num2);
    }

    void display(double num) {
        System.out.println("Double number : " + num);
    }

    void display(String text) {
        System.out.println("String : " + text);
    }
}

public class seven {
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.display(10);
        obj.display(5, 15);
        obj.display(3.14);
        obj.display("Hello");
    }
}
