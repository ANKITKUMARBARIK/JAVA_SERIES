abstract class Account {
    abstract void calculateInterest();  // like services
}

class SavingAccount extends Account {
    // define
    void calculateInterest() {
        System.out.println("I am changed");
    }
}

// agar B class inherit kr rha h A abstract class ke abstract method ko toh B ko
// bhi abstract banana padega n...kyu ki remember class mein abstract method
// banaoge toh wo class ko abstract class banana padega .........ab dusra
// concept suno agar class B abstract nhi banana uske lie...class A ke abstract
// method ko class B mein define/overwrite kr rhe hain ..toh class B ko abstract
// class banana nhi padega....

public class twentysecond {
    public static void main(String[] args) {
        System.out.println("ABSTRACT CLASS AND METHOD");

        // B b = new B();
        // A a = new B();

        SavingAccount s = new SavingAccount();
        s.calculateInterest();
    }
}

// Abstract Class
// Abstract classes are declared with the abstract keyword.
// An abstract class cannot be instantiated.
// An abstract class we can create constructor.
// An abstract class we can't create object for that class
// common properties ko provide krne ke lie hum abstract class bana lete
// hain...kyu ki bohot saare class ki property similar hoti h......aur baki sb
// classes ye abstract class ko extend krke property use kr sakte hain

// Java Abstract classes are used to declare common characteristics of
// subclasses.
// It can only be used as a superclass for other classes that extend the
// abstract class.
// Like any other class, an abstract clas contain fields that describe the
// characteristics and methods that describe the actions that a class can
// perform.
// You can not create object of abstract class but you can create reference
// variable of abstract class

// Abstract Methods
// An abstract class can include methods that contain no implementation. These
// are called abstract methods.
// The abstract method declaration must then end with a semicolon rather than a
// block.

// If a class has any abstract methods, whether declared or inherited, the
// entire class must be declared abstract...
// If a class has abstract class...then it's not compulsory in abstract class
// has any abstract method