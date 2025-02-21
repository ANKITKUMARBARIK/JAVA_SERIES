interface Marker {
}

class Product implements Marker {
    int product_id, product_quantity;
    long product_cost;
    String product_name;
    static int count;

    public Product() {
        count++;
        this.product_id = 000;
        this.product_name = "Unknown";
        this.product_cost = 00000;
        this.product_quantity = 0;
        count();
        display();
    }

    public Product(int product_id, String product_name, long product_cost, int product_quantity) {
        count++;
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_cost = product_cost;
        this.product_quantity = product_quantity;
        count();
        display();
    }

    public void display() {
        System.out.println(product_id);
        System.out.println(product_name);
        System.out.println(product_cost);
        System.out.println(product_quantity);
        System.out.println("------------------------------");
    }

    static void count() {
        System.out.println("Total " + count + " objects created");
    }
}

public class ten {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Mac", 120000, 1);
        Product p2 = new Product();
        Product p3 = new Product(102, "Iphone", 80000, 2);
    }
}