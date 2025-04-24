import java.util.*;

public class bcd {
    public static void main(String[] args) {
        int[] arrr = new int[3];
        arrr[0] = 2;
        arrr[1] = 4;
        arrr[2] = 5;

        System.out.println(arrr.length);
        System.out.println(arrr[0]);

        for (int i = 0; i < arrr.length; i++) {
            System.out.printf("Array [%d] : %d\n", i, arrr[i]);
        }

        for (int i : arrr) {
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter array " + i + " : ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array " + i + " : " + arr[i]);
        }

        
        // searching
        for (int i : arr) {
            if (i == 32)
                System.out.println("Search element : " + i);
        }

        // find max element
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max : " + max);

        // reverse
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        // sum
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Sum : " + sum);
    }
}
