package bank;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String actNumber, String actHolder, double balance, double overdraftLimit) {
        super(actNumber, actHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit.");
        }
    }
}
