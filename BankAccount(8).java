package bank;

public class BankAccount {
    protected String actNumber;
    protected String actHolder;
    protected double balance;

    public BankAccount(String actNumber, String actHolder, double balance) {
        this.actNumber = actNumber;
        this.actHolder = actHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Deposit amount should be positive.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + actNumber);
        System.out.println("Account Holder: " + actHolder);
        System.out.println("Current Balance: Rs." + balance);
    }
}
