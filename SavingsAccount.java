package bank;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String actNumber, String actHolder, double balance, double interestRate) {
        super(actNumber, actHolder, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: Rs." + interest);
    }
}
