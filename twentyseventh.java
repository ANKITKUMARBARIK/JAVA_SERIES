import java.io.*;

public class twentyseventh {
    public static void main(String[] args) {
        System.out.println("EXCEPTION HANDLING");

        // int[] min = new int[args.length];
        // for(int i=0;i<args.length;i++){
        // min[i] = Integer.parseInt(args[i]);
        // }

        // int temp;
        // for(int i=0;i<min.length;i++){
        // for(int j=i+1;j<min.length;j++){
        // if(min[i] > min[j]){
        // temp = min[i];
        // min[i] = min[j];
        // min[j] = temp;
        // }
        // }
        // }

        // for(int i : min){
        // System.out.println(i);
        // }

        // int max=Integer.MAX_VALUE;
        // for(int i=0;i<args.length;i++){
        // if(max > Integer.parseInt(args[i])){
        // max = Integer.parseInt(args[i]);
        // }
        // }
        // System.out.println("Max : "+ max);

        // System.out.println("EXCEPTION HANDLING 1");
        // System.out.println("Result : "+ 10/0); // run time pe java ne
        // ArithmeticException class ka object banaya aur usse thrown kr dia..aur
        // program stopped ho gaya.
        // System.out.println("LastLine");

        // String s1;
        // System.out.println("EXCEPTION HANDLING 2");
        // System.out.println("String Result : "+ s1.length()); // compile time error
        // System.out.println("LastLine");

        // String s1=null;
        // System.out.println("EXCEPTION HANDLING 3");
        // System.out.println("String Result : "+ s1.length()); // run time pe java ne
        // NullPointerException class ka object banaya aur usse thrown kr dia..aur
        // program stopped ho gaya.
        // System.out.println("LastLine");



        // CHECKED EXECPTION

        // throws
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Ooo " + e.getMessage());
        }




        // DEFAULT THROW AUR CATCH------------------------------------------------>
        System.out.println("START1");
        try {
            System.out.println(10 / 0);
            System.out.println("in try");
        } catch (ArithmeticException e) {
            System.out.println("Bhaiii " + e.getMessage());
        } finally {
            System.out.println("Hello");
        }
        System.out.println("END1"); // program is still executed

        // multiple catch
        System.out.println("START2");
        String s2 = null;
        try {
            System.out.println(s2.length());
            System.out.println("in try");
        } catch (ArithmeticException e) {
            System.out.println("Bhaiii " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Bhauu " + e.getMessage());
        } finally {
            System.out.println("Hello");
        }
        System.out.println("END2"); // program is still executed

        // OUR THROW OUR CATCH------------------------------------------------>
        System.out.println("START3");
        int bal = 5000;
        int withdraw = 6000;
        try {
            if (bal < withdraw) {
                throw new ArithmeticException("Insufficient balance");
            } else {
                bal -= withdraw;
                System.out.println("Transaction successfully completed");
                System.out.println("Program continue");
            }
        } catch (ArithmeticException e) {
            System.out.println("Bhai system " + e.getMessage());
        }
        System.out.println("END3");

        // OUR THROW DEFAULT CATCH------------------------------------------------>
        System.out.println("START4");
        int balance = 5000;
        int withdrawAmt = 6000;
        if (balance < withdrawAmt) {
            throw new ArithmeticException("Insufficient balance");
        } else {
            balance -= withdrawAmt;
            System.out.println("Transaction successfully completed");
            System.out.println("Program continue");
        }
        System.out.println("END4");


    }
}
