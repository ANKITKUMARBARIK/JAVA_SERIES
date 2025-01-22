public class seventh {
    // data members
    int x = 5;
    int y;

    // member functions
    void stud() {
        System.out.println("Public methods must be called by creating objects");
    }

    static void teach(){     // static method
        System.out.println("Static methods can be called without creating objects");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        // CLASS & OBJECTS

        seventh myObj1 = new seventh(); // object
        System.out.println(myObj1.x);

        seventh myObj2 = new seventh(); // object
        myObj2.y = 10;
        System.out.println(myObj2.y);

        myObj2.stud();

        teach();
        
    }
}
