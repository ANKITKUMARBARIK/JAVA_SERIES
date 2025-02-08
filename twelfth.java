public class twelfth {
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
        System.out.println(c == d);
        // true -- because Jab tum String c = "Ram"; aur String d = "Ram"; likhte ho, to
        // Java
        // String Pool ka concept use karta hai.
        // String Pool kya hota hai?
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
    }
}