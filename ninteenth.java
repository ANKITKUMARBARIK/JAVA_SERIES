public class ninteenth {
    // valueOf()
    // • Static method.
    // • Return Object reference of relative wrapper class
    // parseXxx()
    // • Static method
    // • Xxx can be replaced by any primitive type
    // • It returns xxx type value
    // xxxValue()
    // • Instance method of wrapper class
    // • Xxx can be replaced by any primitive type
    // • Returns corresponding primitive type
    public static void main(String[] args) {
        System.out.println("WRAPPER CLASSES");

        // valueOf() static method ne ek object banaya Integer, Double..etc class ka
        // valueOf("") -> argument mein string pass krna hota h ...Integer class ka
        // object apne andar number hi rakhega but hum strings mein value passs krte
        // hain
        Integer a = Integer.valueOf("667"); // a is reference variable
        Integer ack = Integer.valueOf("101011", 2); // ack is reference variable
        Double b = Double.valueOf("5.64"); // b is reference variable
        System.out.println(a);
        System.out.println(ack);
        System.out.println(b);

        int c = Integer.parseInt("223"); // c is reference variable
        double d = Double.parseDouble("13.45"); // d is reference variable
        System.out.println(c);
        System.out.println(d);

        int e = ack.intValue();    // e is reference value
        double f = b.doubleValue();    // f is reference value
        System.out.println(e);
        System.out.println(f);
    }
}