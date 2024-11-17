import bank.BankAccount;
import bank.SavingsAccount;
import bank.CurrentAccount;

public class BankTest {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("SA123", "Alice", 1500.0, 3.0);
        savings.displayBalance();
        savings.deposit(300);
        savings.addInterest();
        savings.displayBalance();

        System.out.println("---------------");

        CurrentAccount current = new CurrentAccount("CA456", "Bob", 1000.0, 500.0);
        current.displayBalance();
        current.deposit(200);
        current.withdraw(800);
        current.withdraw(1500);
        current.displayBalance();
    }
}
