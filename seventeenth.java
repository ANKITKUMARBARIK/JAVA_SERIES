class Box {
    private int l, b, h;

    void setDimension(int l, int b, int h) { // instance member function
        this.l = l;
        this.b = b;
        this.h = h;
    }

    void display() { // instance member function
        System.out.println(l);
        System.out.println(b);
        System.out.println(h);
    }
}

public class seventeenth {
    public static void main(String[] args) { // static member function
        System.out.println("THIS KEYWORD");

        Box b1 = new Box();
        b1.setDimension(10, 20, 30);
        b1.display();
    }
}

// The this object reference is a local variable in
// instance member methods referring the caller
// object.

// this keyword is used as a reference to the
// current object which is an instance of the
// current class.

// The this reference to the current object is useful
// in situations where a local variable hides, or
// shadows, a field with the same name.

// If a method needs to pass the current object
// to another method, it can do so using the
// this reference.

// Note that the this reference cannot be used
// in a static context, as static code is not
// executed in the context of any object.