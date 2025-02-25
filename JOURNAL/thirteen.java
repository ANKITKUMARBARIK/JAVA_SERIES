class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount, String name) {
        System.out.println(name + " is depositing " + amount);
        balance += amount;
        System.out.println("Updated balance after " + name + "'s deposit: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private int amount;
    private String depositor;

    public DepositThread(BankAccount account, int amount, String depositor) {
        this.account = account;
        this.amount = amount;
        this.depositor = depositor;
    }

    public void run() {
        account.deposit(amount, depositor);
    }
}

public class thirteen {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        DepositThread user1 = new DepositThread(account, 500, "Alice");
        DepositThread user2 = new DepositThread(account, 700, "Bob");
        DepositThread user3 = new DepositThread(account, 300, "Charlie");

        user1.start();
        user2.start();
        user3.start();
    }
}
