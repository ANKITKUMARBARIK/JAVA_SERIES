import java.util.Scanner;

public class twentyfifth {
    public static void main(String[] args) {
        System.out.println("ONE DIMENSIONAL ARRAY");

        // type[] variableName
        int[] arr = { 1, 2, 3 }; // declare
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // using new heap ke andar ek array of integer type ka memory allocate ho rha h
        // aur.....stack mein arra ek reference variable h
        int[] arra = new int[5]; // initialize
        arra[0] = 23;
        arra[1] = 24;
        arra[2] = 25;
        arra[3] = 26;
        arra[4] = 27;
        System.out.println(arra[0]);
        System.out.println(arra[1]);
        System.out.println(arra[2]);
        System.out.println(arra[3]);
        System.out.println(arra[4]);
        for (int i = 0; i < arra.length; i++) {
            System.out.println(arra[i]);
        }

        //

        int[] arrai = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrai.length; i++) {
            System.out.print("Enter arr : ");
            arrai[i] = sc.nextInt();
        }
        for (int i = 0; i < arrai.length; i++) {
            System.out.println("Array " + i + " : " + arrai[i]);
        }

        // for-each loop specially for array
        for (int i : arrai) {
            System.out.println(i);
        }

        // search a element in an array
        int[] arr1 = { 1, 4, 2, 55, 7, -2 };
        for (int i : arr1) {
            if (i == 55) {
                System.out.println("55 FOUND");
            }
        }

        // find max element
        int[] arr2 = { 3, 44, 5, -55, -77, 88, 4 };
        // int max = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            if (max < arr2[i]) {
                max = arr2[i];
            }
        }
        System.out.println(max);

        // find reverse element
        int[] arr3 = { 3, 7, 6, 8, 9 };
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.println(arr3[i]);
        }

        // find sum of element
        int[] arr4 = { 32, 7, 63, 8, 93 };
        int sum = 0;
        for (int i : arr4) {
            sum += i;
        }
        System.out.println("Sum : " + sum);

    }
}
