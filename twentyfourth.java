import java.util.*;

public class twentyfourth {
    public static void main(String[] args) {
        System.out.println("Scanner Class for user input");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name : ");
        // String name = a.next();
        String name = sc.nextLine();

        System.out.print("Enter a age : ");
        int age = sc.nextInt();

        System.out.println(name);
        System.out.println(age);
    }
}

// Scanner sc = new Scanner(System.in);
// We can read java input from System.in using Scanner class.
// Scanner is final class, that is can not be extended.
// Scanner class is a part of java.util package.
// sc -> ek reference variable hai jo Scanner class ka object store karta hai.
// sc -> Iske through hum Scanner class ke methods ko access kar sakte hain.
// new Scanner(...) ka matlab hai ki hum ek naya Scanner object bana rahe hain.
// System.in ek object hai, jo InputStream class ka instance hai.
// `in` ek static variable hai jo System class ke andar define hai.
// System.in ka matlab hai standard input stream, jo ki keyboard se input lene
// ka kaam karta hai.
// Yahan Scanner ka constructor System.in ko accept kar raha hai.
// System.in ek InputStream object hai jo keyboard se data read karne ke liye
// use hota hai.
// jab hum keyboard se data input krte hain wo basically ek intermediate
// location mein jata h wo h `Buffer` like array.
// System.in represent krta h jo keyboard se attach wo system jo responsible hai
// buffer mein data lane ke lie... usse represent krta h.
// Scanner class ka object `new` se banta h.. ab Scanner class ke constructor
// mein hum System.in(read data inputed by user) pass krenge
// sc.nextInt() ka kaam buffer se data uthana aur usse integer mein convert
// karna bydefault raw characters (byte)data format mein hote hain.... int x =
// sc.nextInt() aur convert krke x variable mein rakhna

// A Scanner breaks its input into tokens using a delimiter pattern, which by
// default matches whitespace.
// The resulting tokens may then be converted into values of different types
// using the various next methods.
