class Example {
    int demo = 100;
    static String lname = "bro"; // static member variable

    void lnameCase() {
        System.out.println(lname);
    }

    // 🔥 Static Variable (Class-level Variables)
    // ☑ Class ke andar declare hota hai, `static` keyword ke saath (lekin method ke
    // andar nahi).
    // ☑ Static Inner Class bana sakte hain, `static` keyword ke saath. ex - (
    // static class Example{ } )
    // ☑ Har object ke liye alag copy nahi banti, ek hi shared memory hoti hai.
    // ☑ Default value hoti hai (agar koi value assign nahi ki to default value lete
    // hain, jaise int ke liye 0, boolean ke liye false)
    // ☑ Jab class load hoti hai tab memory allocate hoti hai (Method Area ya
    // MetaSpace me store hota hai).
    // ☑ `ClassName.variableName` se access kar sakte hain.

    static void func() { // static member function
        System.out.println("i am static : " + lname);
    }
    // 🔥 Static Method
    // ☑ Directly class se belong karta hai, object se nahi.
    // ☑ this aur super keyword ka use nahi kar sakte, kyunki ye object-specific
    // hote hain.
    // ☑ Sirf static data (static variables) ko access kar sakta hai.
    // ☑ Static method ko bina object banaye direct ClassName.methodName() se call
    // kar sakte hain.

    static class innerExample {
        static void show() {
            System.out.println("Static Nested Class");
        }
    }
    // 🔥 Static Nested Class
    // ☑ Ek class ke andar ek aur class hoti hai jo static hoti hai.
    // ☑ Static nested class ko bina outer class ka object banaye access kar sakte
    // hain.
    // ☑ Static nested class ko directly OuterClass.InnerClass likhkar access kar
    // sakte hain.
}

public class eleventh {
    static {
        System.out.println("Static Block Executed!");
    }

    // 🔥 Static Block
    // ☑ Jab class load hoti hai tab execute hota hai.
    // ☑ Ek class me multiple static blocks ho sakte hain, jo top-to-bottom execute
    // hote hain.
    // ☑ Main method se pehle execute hota hai.
    // ☑ Yaha static block main method se pehle execute hota hai.
    public static void main(String args[]) {
        System.out.println("Main Method Executed!");

        //
        System.out.println("STATIC CONCEPT-------------");
        Example c = new Example();
        Example d = new Example();
        c.lnameCase();
        d.lnameCase();
        Example.lname = "dude"; // class name se static variables ko use kr sakte hain
        c.lnameCase();
        d.lnameCase();

        Example.func(); // class name se static function ko invoke/call kr sakte hain

        // mene abhi c aur d name ka object banaya ..usme demo name ka variable hoga but
        // lname variable nhi hoga....kyu ki ye static h aur ye koi instance/object ka
        // variable nhi h ..ye puri class ke lie ek baar bante hain..matlab...aisa
        // variable jisme class specific information rakhi jaegi naa ki object
        // specific..agar ye class ka ek bhi object nhi banau toh bhi lname variable
        // banega

        Example.innerExample.show(); // class name se static static inner class ko access kr sakte hain

    }
}
