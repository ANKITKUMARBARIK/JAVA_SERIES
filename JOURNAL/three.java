public class three {

    public static void main(String[] args) {
        for (int i = 6; i > 1; i--) {
            for (int j = i - 1; j < 6; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int temp = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                if (temp == 1) {
                    temp = 0;
                } else {
                    temp = 1;
                }
            }
            System.out.println();
        }

    }
}