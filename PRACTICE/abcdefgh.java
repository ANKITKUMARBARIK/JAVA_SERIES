class Example{
    public Example(){
        System.out.println("Parent Deafult");
    }
    public Example(int l,int b){
        this();
        System.out.println(l*b);
    }
    public void func(){
        System.out.println("Hello");
    }
}
class Student extends Example{
    public Student(){
        super(2,4);
        System.out.println("Child Default");
    }
    public Student(int l,int b){
        this();
        System.out.println(l*b);
    }
    public void func(){
        super.func();
        System.out.println("Hello Buddy");
    }
}
public class abcdefgh {
    public static void main(String[] args) {
        Student s = new Student(2,3);
        s.func();
    }
}
