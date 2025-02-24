import java.io.*;
import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {

        try {
            File f = new File("temp.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number > 0) {
                    throw new Exception("Positive numbers are not allowed");
                }
            }
            System.out.println("No positive numbers found in the file.");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}