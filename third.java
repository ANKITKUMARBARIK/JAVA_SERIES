public class third {
    public static void main(String args[]) {
        System.out.println("Hello");
        // IF - ELSE IF - ELSE and SHORT HAND IF..ELSE and SWITCH CASE
        int age = 18;
        if (age >= 18 && age < 30) {
            System.out.println("You can vote");
            System.out.println("You can drive");
        } else if (age >= 30) {
            System.out.println("You can join politics");
        } else {
            System.out.println("Go School and take Shiksha");
        }

        //
        int umar = 14;
        String result = (umar >= 18) ? "You can vote" : "Go school";
        System.out.println(result);

        //
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}