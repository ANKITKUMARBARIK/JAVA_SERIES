import java.util.*;

class Employee {
    String name;
    int age, salary;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        name = sc.nextLine();
        System.out.print("Enter age : ");
        age = sc.nextInt();
        System.out.print("Enter salary : ");
        salary = sc.nextInt();
    }

    
}

public class cde {
    public static void main(String[] args) {
        Employee[] e = new Employee[3];
        for(int i=0;i<e.length;i++){
            e[i] = new Employee(); // new object created
            e[i].input();
        }

        int temp;
        for(int i=0;i<e.length;i++){
            for(int j=i+1;j<e.length;j++){
                if(e[i].salary > e[j].salary){
                    temp = e[i].salary;
                    e[i].salary = e[j].salary;
                    e[j].salary = temp;
                }
            }
        }

        for(int i=0;i<e.length;i++){
            System.out.println(e[i].salary);
        }

        
    }
}
