import java.util.Scanner;

public class twentysixth {
    public static void main(String[] args) {
        System.out.println("TWO DIMENSIONAL ARRAY");

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(matrix[0][0]);
        System.out.println(matrix[0][1]);
        System.out.println(matrix[0][2]);
        System.out.println(matrix[1][0]);
        System.out.println(matrix[1][1]);
        System.out.println(matrix[1][2]);
        System.out.println(matrix[2][0]);
        System.out.println(matrix[2][1]);
        System.out.println(matrix[2][2]);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //

        // int[][] arr = new int[2][2];
        // arr[0][0] = 101;
        // arr[0][1] = 101;
        // arr[1][0] = 101;
        // arr[1][1] = 101;

        //

        char[][] ch = new char[3][2];
        ch[0][0] = 'A';
        ch[0][1] = 'D';
        ch[1][0] = 'M';
        ch[1][1] = 'I';
        ch[2][0] = 'N';
        ch[2][1] = 'S';
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[i].length; j++) {
                System.out.print(ch[i][j] + " ");
            }
            System.out.println();
        }

        //

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a row size : ");
        int row = sc.nextInt();
        System.out.print("Enter a col size : ");
        int col = sc.nextInt();
        int[][] arro = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Array of " + i + " " + j + " : ");
                arro[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arro[i][j] + " ");
            }
            System.out.println();
        }
    }
}
