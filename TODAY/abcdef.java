class Student{
    static int lname = 21;

    static void func(){
        System.out.println(lname);
    } 

    static class innerStudent{
        static void view(){
            System.out.println("Hello");
        }
    }
}
public class abcdef {
    static{
        System.out.println("Dear Start");
    }
    public static void main(String[] args) {
        System.out.println(Student.lname);
        Student.func();
        Student.innerStudent.view();
    }
}
