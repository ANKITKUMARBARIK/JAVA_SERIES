public class twelfth {
    // String ek predefined class h ..ye java.lang package mein hota hai..aur ye ek
    // final class h...String class is immutable.
    public static void main(String[] args) {
        System.out.println("Strings");
        String a = new String("Ram");
        String b = new String("Ram");
        String c = "Ram";
        String d = "Ram";
        System.out.println(a == b);
        // false --HEAP MEMORY - because a aur b ka memory location different hai ..jab
        // hum new ka use krte hain toh ek naya object banta h.. a ka new object aur b
        // ka new object ...islie dono alag alag location h that's why false h..
        System.out.println(c == d); // ye reference compare krta hain
        System.out.println(c.equals(b)); // ye strings compare krte hain..true kyu ki equals() ye method values dekhta
                                         // h...
        // true -- because Jab tum String c = "Ram"; aur String d = "Ram"; likhte ho, to
        // Java
        // String Pool ka concept use karta hai.
        // String Pool kya hota hai?
        // String Pool Heap memory ka ek part h...ye heap memory ke andar rahta h .... c
        // aur d ye reference variable h ...jo address store kr rhe hain String Pool ke
        // strings ka..
        // Java mein strings ko optimize karne ke liye String Pool naam ka ek memory
        // area hota hai. Jab bhi tum ek string literal ("Ram") banate ho, to Java check
        // karta hai ki kya yeh string pool mein already exist karti hai ya nahi. Agar
        // exist karti hai, to usi existing reference ko use kiya jata hai, nahi to ek
        // naya object create hota hai.
        // Step 1: "Ram" ek string literal hai, to yeh String Pool mein store ho jata
        // hai.
        // Step 2: Jab String c = "Ram"; execute hota hai, to "Ram" String Pool mein
        // store hota hai aur c uska reference hold karta hai.
        // Step 3: Jab String d = "Ram"; likha, to Java check karega ki "Ram" pehle se
        // String Pool mein hai. Kyunki yeh already present hai, d bhi usi reference ko
        // hold karega.
        // Step 4: Jab c == d check kiya gaya, to dono variables (c aur d) same memory
        // reference point kar rahe the, is wajah se result true aaya.

        // STRING METHODS
        String s1 = new String("uppercase");
        String s2 = "uppercase";
        String s3 = "UpperCase";
        String s4 = "Upper Case";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.indexOf('e'));
        System.out.println(s1.indexOf('e', 4));
        System.out.println(s1.indexOf("pe"));
        System.out.println(s1.indexOf("pe", 1));
        System.out.println(s1.lastIndexOf('e'));
        System.out.println(s1.lastIndexOf('e', 5));
        System.out.println(s1.lastIndexOf("er"));
        System.out.println(s1.lastIndexOf("er", 6));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        if ((s1.compareTo(s3) == 0)) {
            System.out.println("Strings are Compare");
        } else {
            System.out.println("String not compare");
        }
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5, 8));
        System.out.println(s4.trim());
        System.out.println(s1.startsWith("upper"));
        System.out.println(s1.startsWith("pper", 1));
        System.out.println(s1.endsWith("case"));
        System.out.println(s1.replace("u", "s"));
        System.out.println(s1.length());
        System.out.println(s1.charAt(4));

        // STRING BUFFER METHODS
        StringBuffer s5 = new StringBuffer("Hello");
        System.out.println(s5.append("World "));
        System.out.println(s5.insert(11,"Exxcuse Me"));
        System.out.println(s5.reverse());
        s5.setCharAt(3,'_');
        System.out.println(s5);
        System.out.println(s5.charAt(5));
        System.out.println(s5.substring(5));
        System.out.println(s5.deleteCharAt(5));
        System.out.println(s5.capacity());
        System.out.println(s5.length());
        System.out.println(s5.delete(3, s5.length()));
    }
}