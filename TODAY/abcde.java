interface A{
    void func();
}
interface B{
    void funco();
}
class Animal implements A,B{
    public void func(){
        System.out.println("A");
    }
    public void funco(){
        System.out.println("B");
    }
    void dis(){
        System.out.println("Animal");
    }
}
public class abcde {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.dis();
        a.func();
        a.funco();
    }
}
