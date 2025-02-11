// final class -- u can't inherit/extends
final class dummy {

}

// final methods --> u can't override
class example {
    public final void myfunc() {
        System.out.println("hello");
    }
}

class stud extends example {
    // public void myfunc() {
    // System.out.println("hii");
    // }
}

public class twentyfirst {
    private int x; // instance member variable
    private final int y = 5; // final instance member variable -> by default blank variable
    private final int z;

    // initialization block
    // {
    // y = 5;
    // }

    twentyfirst() {
        z = 10;
        System.out.println("final use with help of constructor : " + z);
    }

    // final static member variable
    private final static int a = 6;
    // static{
    // a = 6;
    // }

    // final local variable
    public void func() {
        final int k = 9;
        System.out.println(k);
    }

    public static void main(String[] args) {
        System.out.println("FINAL KEYWORD");

        twentyfirst t = new twentyfirst();
        System.out.println("without final and initialize by default : " + t.x); // by default value 0
        System.out.println("final use with normal initialize : " + t.y);
        System.out.println(twentyfirst.a);
        t.func();
    }
}

// A java variable can be declared using the
// keyword final. Then the final variable can be
// assigned only once.
// A variable that is declared as final and not
// initialized is called a blank final variable. A
// blank final variable forces either the
// constructors to initialize it or initialization
// block to do this job.

// Static member variable when qualified with
// final keyword, it becomes blank untill
// initialized.
// Final static variable can be initialized during
// declaration or within the static block

// Local variables that are final must be
// initialized before it's use, but you should
// remember this rule is applicable to non final
// local variables too.
// Once they are initialized, can not be altered.

// Java classes declared as final cannot be
// extended. Restricting inheritance!

// Methods declared as final cannot be
// overridden