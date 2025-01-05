public class second{
    public static void main(String args[]){
        System.out.println("Hello");
        // TYPE CASTING

        int a = 5;
        float b = (float) a;
        System.out.println("integer to float : " + b);

        int c = 8;
        double d = (double) c;
        System.out.println("integer to double : " + d);

        double e = 8.38;
        int f = (int) e;
        System.out.println("double to integer : " + f);

        float g = 4.32f;
        int h = (int) g;
        System.out.println("float to integer : " + h);

        int i = 3;
        String j = String.valueOf(i);
        System.out.println("integer to String : " + j);

        String k = "10";
        int l = Integer.parseInt(k);
        System.out.println("integer to String : " + l);
    }
} 