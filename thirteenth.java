class Box {
    private int l, b, h;

    public Box() {
        l = 10;
        b = 20;
        h = 30;
    }

    void display() {
        System.out.println("Length : " + l);
        System.out.println("Breadth : " + b);
        System.out.println("Height : " + h);
    }
}

public class thirteenth {
    private int r;

    public thirteenth() {
        r = 90;
    }

    public thirteenth(int r) {
        this.r = r;
    }

    void display() {
        System.out.println("Radius : " + r);
    }

    public static void main(String[] args) {
        System.out.println("Constructor");
        Box b = new Box();
        b.display();

        thirteenth t1 = new thirteenth();
        thirteenth t2 = new thirteenth(66);
        t1.display();
        t2.display();

        // humne two constructor banae same class ke issi ko constructor overloading
        // kehte hain..

        // Constructor is a member function of a class.

        // The name of constructor is same as the name of the
        // class.

        // Constructor has no return type.

        // A constructor is a special method that is used
        // to initialize a newly created object and is called
        // implicitly, just after the memory is allocated for the
        // object.

        // It is not mandatory for the coder to write a
        // constructor for the class.

        // When there is no constructor defined in the class by
        // programmer, compiler implicitly provide a default
        // constructor for the class.
        // ex - public Example(){ }

        // Constructors can be parameterized.

        // Constructors can be overloaded.
    }
}