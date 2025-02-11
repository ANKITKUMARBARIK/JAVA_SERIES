public class twentieth {
    public static void main(String[] args) { // args -> reference variable ....which store array of strings
        // wrapper class
        Integer a = Integer.valueOf("455");
        System.out.println(a);

        // command line arguments
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        // run -> java nineteenth admin user pass // admin, user, pass -> is arguments

        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("Sum : " + sum);
    }
}