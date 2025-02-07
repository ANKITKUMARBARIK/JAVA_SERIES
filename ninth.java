public class ninth {
    public static void main(String[] args) {
        // integral numbers
        byte a = 20;
        short b = 20;
        int c = 20;
        long d = 20l;

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        // decimal numbers
        float salary = 1000.567f;
        double rate = 1000.5675555555555678;
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        // characters
        char name = 'C';
        System.out.println((int) name);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println((int) Character.MIN_VALUE);
        System.out.println((int) Character.MAX_VALUE);
        System.out.println((char) 10084);
        char hindiChar = 2309;
        System.out.println(hindiChar);
        // in memory character has been stored as a number..

        // float num1 = 23.5655557f;
        // double num2 = 5465557.56777;
        float num1 = 23.6778f;
        float num2 = 54.9995f;
        String sum = "Sum";
        System.out.println(sum + " of " + num1 + " & " + num2 + " : " + (num1 + num2));
        System.out.printf("%s of %f & %f : %.2f \n", sum, num1, num2, num1 + num2);
    }
}