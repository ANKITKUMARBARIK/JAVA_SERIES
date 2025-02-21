class Employee {
    int id, salary;
    String name, deptname;
    public static int count;

    public Employee() {
        count++;
        this.id = 0;
        this.name = "unknown";
        this.deptname = "anonymous";
        this.salary = 0;
        count();
        display();
    }

    public Employee(int id, int salary, String name, String deptname) {
        count++;
        this.id = id;
        this.name = name;
        this.deptname = deptname;
        this.salary = salary;
        count();
        display();
    }

    static void count() {
        System.out.println(count + " objects are created...");
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + deptname);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }
}

public class five {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, 20000, "admin1", "developing");
        Employee e2 = new Employee(102, 15000, "admin2", "accountant");
        Employee e3 = new Employee(103, 17500, "admin3", "managing");
        Employee e4 = new Employee();
    }
}
