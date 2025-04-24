public class abcd {
    public static void main(String[] args) {
        System.out.println("Hello");
        double d = 36.44;
        int a = (int) d;
        System.out.println(a);
        String s = "123";
        int b = Integer.parseInt(s);
        System.out.println(b);
        if (a > 54) {
            System.out.println("Dear");
        } else {
            System.out.println("Pear");
        }

        String week = "Tuesday";
        switch (week) {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday of the day");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("No more");
                break;
        }

        int i = 0;
        while (i < 3) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
            i++;
        } while (i < 3);

        for (int j = 0; j < 3; j++) {
            System.out.println(j);
        }


        
    }
}