public class fifth {
    public static void funcName(String username) {
        System.out.println("username : " + username);
    }

    public static int funcPass(int pass) {
        System.out.println("password : " + pass);
        return pass;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        // FUNCTIONS

        funcName("admin");
        funcPass(231);
    }
}
