abstract class Order {
    int id;
    String description;

    abstract void customer(int id, String description, String customerName);

    abstract void vendor(int id, String description, String vendorName);
}

class PurchaseOrder extends Order {
    String customerName;

    void customer(int id, String description, String customerName) {
        this.id = id;
        this.description = description;
        this.customerName = customerName;
    }

    void vendor(int id, String description, String vendorName) {
    }

    void display() {
        System.out.println(id);
        System.out.println(description);
        System.out.println(customerName);
    }
}

class SalesOrder extends Order {
    String vendorName;

    void vendor(int id, String description, String vendorName) {
        this.id = id;
        this.description = description;
        this.vendorName = vendorName;
    }

    void customer(int id, String description, String customerName) {
    }

    void display() {
        System.out.println(id);
        System.out.println(description);
        System.out.println(vendorName);
    }
}

public class nine {
    public static void main(String[] args) {
        PurchaseOrder p = new PurchaseOrder();
        SalesOrder s = new SalesOrder();
        p.customer(101, "Electronics", "admin101");
        p.display();
        p.customer(102, "Marble", "admin102");
        p.display();
        p.customer(103, "Software", "admin103");
        p.display();
        s.vendor(1, "Havels", "admin1");
        s.display();
        s.vendor(2, "Tata", "admin2");
        s.display();
        s.vendor(3, "Bajaj", "admin3");
        s.display();
    }
}