import java.util.*;

public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of first matrix : ");
        int r1 = sc.nextInt();
        System.out.print("Enter cols of first matrix : ");
        int c1 = sc.nextInt();
        int[][] matrixOne = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print("MatrixOne " + i + " " + j + " : ");
                matrixOne[i][j] = sc.nextInt();
            }
        }
        //
        System.out.print("Enter rows of second matrix : ");
        int r2 = sc.nextInt();
        System.out.print("Enter cols of second matrix : ");
        int c2 = sc.nextInt();
        int[][] matrixTwo = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print("MatrixTwo " + i + " " + j + " : ");
                matrixTwo[i][j] = sc.nextInt();
            }
        }
        //
        System.out.println("First Matrix");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }
        //
        System.out.println("Second Matrix");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(matrixTwo[i][j] + " ");
            }
            System.out.println();
        }
        //
        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += matrixOne[i][k] * matrixTwo[k][j];
                }
            }
        }

        System.out.println("Product of Matrices:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}