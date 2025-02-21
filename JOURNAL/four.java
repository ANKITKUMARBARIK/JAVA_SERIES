import java.util.*;

public class four {
    public static void main(String[] args) {

        int[] sort = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            sort[i] = Integer.parseInt(args[i]);
        }

        int temp;
        for (int i = 0; i < sort.length; i++) {
            for (int j = i + 1; j < sort.length; j++) {
                if (sort[i] > sort[j]) {
                    temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;
                }
            }
        }

        for (int i : sort) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
