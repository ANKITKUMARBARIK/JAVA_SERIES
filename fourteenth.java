class Student {
    protected int rollno = 83;
    String name = "admin";

    void action() {
        System.out.println("Action : BAD");
    }
}

public class fourteenth extends Student {
    int age = 21;

    public static void main(String[] args) {
        System.out.println("Inheritance");

        Student s = new Student();
        System.out.println("Rollno : " + s.rollno);
        System.out.println("Name : " + s.name);
        // System.out.println("Age : " + s.age);
        s.action();

        fourteenth f = new fourteenth();
        System.out.println("Rollno : " + f.rollno);
        System.out.println("Name : " + f.name);
        System.out.println("Age : " + f.age);
        f.action();
    }
}
