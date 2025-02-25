class ReverseThread extends Thread {
    public ReverseThread(String name) {
        super(name);
    }
    
    public void run() {
        for (int i = 100; i >= 1; i--) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(6000); // Sleep for 6 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class twelve {
    public static void main(String[] args) {
        ReverseThread thread = new ReverseThread("ReverseCounter");
        thread.start();
    }
}
