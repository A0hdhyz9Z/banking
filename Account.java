public class Account {
    private double balance;

    public Account(double init_balance) {
        balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double Amount) {
        balance = balance + Amount;
    }

    public void withdraw(double Amount) {
        balance = balance - Amount;
    }
}
