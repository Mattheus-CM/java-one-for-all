package martins.mattheus.javaoneforall.javacore.ZZGconcurrent.domain;

public class Account {
    private int balance = 50;

    public int getBalance() {
        return balance;
    }

    public void withdrawal(int amount) {
        this.balance = this.balance - amount;
    }
}
