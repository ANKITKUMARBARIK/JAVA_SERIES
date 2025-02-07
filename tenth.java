class Example {
    String fname = "admin"; // instance member variable

    void fnameCase() {    //instance member function
        System.out.println(fname);
    }

    private int length, breadth, height; // instance member variable
    // why we say instance ?
    // 🔥 Instance Variable (Object-specific Variables)
    // ✅ Class ke andar declare hote hain (lekin method ke andar nahi)
    // ✅ Object-specific hote hain (har object ke liye alag copy hoti hai)
    // ✅ Default value hoti hai (agar koi value assign nahi ki to default value lete
    // hain, jaise int ke liye 0, boolean ke liye false)
    // ✅ Heap memory mein store hote hain
    // ✅ Access modifiers (private, public, protected, default) ke saath use ho
    // sakte hain

    void input(int l, int b, int h) { // instance member function
        length = l;
        breadth = b;
        height = h;
    }

    void display() { // instance member function
        System.out.println("Length : " + length);
        System.out.println("Breadth : " + breadth);
        System.out.println("Height : " + height);
    }
}

public class tenth {
    public static void main(String args[]) {
        Example e = new Example();
        e.input(10, 20, 30);
        e.display();

        // ab humne fhirse issi reference variable(e) se new object bana dia...islie old
        // (e)reference variable/object garbage value hai or destroy ho jayega
        e = new Example();
        // e.input(11, 20, 30);
        e.display();

        Example ee = new Example();
        ee.input(12, 14, 17);
        ee.display();

        //
        System.out.println("INSTANCE CONCEPT-------------");
        Example c = new Example();
        Example d = new Example();
        c.fnameCase();
        d.fnameCase();
        c.fname = "anonymous";
        c.fnameCase();
        d.fnameCase();

    }
}
