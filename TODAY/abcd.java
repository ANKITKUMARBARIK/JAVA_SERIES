abstract class Student{
    void display(){
        System.out.println("Hello");
    }
    abstract void magic();
}
class Animal extends Student{
    void magic(){
        System.out.println("Magic");
    }
    void view(){
        System.out.println("Hii");
    }
}
public class abcd{
    public static void main(String[] args) {
        Animal d =new Animal();
        d.display();
        d.view();
        d.magic();
    }
}