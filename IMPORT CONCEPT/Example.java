package pack1;

import pack2.Student;

public class Example {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollno(83);
        s1.setName("admin");
        System.out.println("Roll no : " + s1.getRollno());
        System.out.println("Name : " + s1.getName());
    }
}