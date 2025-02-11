interface A {
    void f1();
}

interface B {
    void f2();
}

class Example implements A, B {
    public void f1() {
        System.out.println("Hello f1");
    }

    public void f2() {
        System.out.println("Hello f2");
    }
}

public class twentythird {
    public static void main(String[] args) {
        System.out.println("INTERFACE");
        Example e = new Example();
        e.f1();
        e.f2();

        // interface ka object nhi ban sakta lekin reference variable ban sakta h
        A obj = new Example();
        obj.f1();
        // obj.f2();
    }
}

// Interface definition begins with a keyword interface.
// Interfaces just specify the method declaration (implicitly public and
// abstract) and can only contain fields (which are implicitly public static
// final).

// class ka access modifier by default private hota h
// interface ka access modifier by default public hota h - member and functions
// sab public hota h by default....one more thing we can't explicitly give the
// access modifier.
// An interface like that of an abstract class cannot be instantiated.
// we can't create objects of interface as same as the abstract class.
// Interface do not have constructors...kyu ki iska koi object banega hi nhi toh
// constructor banne ka sawal hi nhi uthta n.....now one question arise ki
// abstract class mein bhi object nhi banta but uska toh constuctor bana sakte
// hain......abhi dhyan se suno ye interview question bhi ho sakta
// h------>Abstract class and Interface ka object nhi banta toh abstract ka
// constructor kyu banta h aur interface ka constructor kyu nhi banta ?
// ---->Suno Abstract class ka object nhi banta.. lekin uske child/sub class ka
// toh object banega ..and we know jab subclass ka object banta h toh subclass
// ka constructor chalta h aur wo apne parent ke constructor ko call kr leta
// h..toh abstract class ka constructor call ho jata h...ab aisa kyu aree bhai
// jaruri thodi n h ki abstract class ke andar jo variables honge wo static hi
// ho..hum instance bhi bana sakte hain jo object related h islie constuctor
// hota h.....but interface mein jo variables banae jaenge wo static hi
// honge..iska matlab static variables object se related nhi hote jisse
// constructor nhi bante interface mein..
// If a class that implements an interface does not define all the methods of
// the interface, then it must be declared abstract and the method definitions
// should be provided by the subclass that extends the abstract class.
// Multiple inheritance/extension is allowed when extending interfaces i.e. one
// interface can extend none, one or more interfaces.
// You can not create object of any interface but creation of object reference
// is possible.
// Object reference of interface can refer to any its subclass type.

// interface Example{
// int x;
// void func();
// }

// func() method by default public h aur abstract bhi h
// x variable by default public, static, final hoti h
// interface mein abstract method ke alawa koi method nhi banta
