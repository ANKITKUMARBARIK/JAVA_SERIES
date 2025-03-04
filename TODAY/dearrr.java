class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("START " + i);
        }
    }
}

class B implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("END  " + i);
        }
    }
}

public class dearrr {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        Thread b = new Thread(new B());
        b.start();
    }
}
