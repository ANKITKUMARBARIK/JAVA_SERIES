class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}

public class sixteenth {
    public static void main(String[] args) {
        System.out.println("OVERRIDING");

        Dog d1 = new Dog();
        d1.displayInfo();
    }
}