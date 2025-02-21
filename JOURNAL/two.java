class electricity {
    double paise;

    public void surcharge(double paise) {
        if (paise > 300) {
            double sur = paise + (paise * 15) / 100;
            System.out.println(sur);
        }
    }

    public void func(double x) {
        if (x < 50) {
            paise = 50;
            System.out.println(paise);
        } else if (x >= 50 && x <= 100) {
            paise = x * 0.60;
            System.out.println(paise);
            surcharge(paise);
        } else if (x > 100 && x <= 300) {
            paise = (100 * 0.60) + ((x - 100) * 0.80);
            System.out.println(paise);
            surcharge(paise);
        } else if (x > 300) {
            paise = (100 * 0.60) + (200 * 0.80) + ((x - 300) * 0.90);
            System.out.println(paise);
            surcharge(paise);
        } else {
            System.out.println("Put electric charge");
        }
    }
}

public class two {

    public static void main(String[] args) {
        electricity e1 = new electricity();
        e1.func(450);
    }
}