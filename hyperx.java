import java.lang.*;
interface Joker{
    static int a = 43;
    static void funcf(){
        System.out.println("dear");
    }
    public void donate();
}
class Student implements Joker{
    String name = "Fello";
    public void donate(){
        System.out.println("donation Birth");
    }
    public Student(){
        System.out.println("Parent Constructor");
    }
    public void func(){
        System.out.println("Dear function");
    }
    public void func(int x){
        System.out.println("Mein huun"+x);
    }
}
class Admin extends Student{
    public Admin(){
        super();
    }
    public void func(int x){
        System.err.println("Child hu");
        super.func(45);
    }
}
public class hyperx{
    public static void main(String[] args){
        System.out.println("Hello");
        Student s  = new Student();
        s.func();
        s.func(34);
        Admin a  = new Admin();
        a.func(56);
        Student s1 = new Student();
        s1.donate();
        System.out.println(Student.a);
        System.out.println(Joker.a);
        Joker.funcf();

        String str = "Hello";
        System.out.println(str);
        String str1 = new String("Manual");
        String str2 = new String("Evidence");
        System.out.println(str1.toUpperCase());
    }
}