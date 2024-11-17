import java.util.Scanner;

class BankAccount {
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
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance + ", AccountHolder: " + actHolder);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String actNumber, String actHolder, double balance, double interestRate) {
        super(actNumber, actHolder, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String actNumber, String actHolder, double balance, double overdraftLimit) {
        super(actNumber, actHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit or invalid amount.");
        }
    }
}

class BankApp {
    public static void main(String[] args) {
        Scanner re = new Scanner(System.in);

        SavingsAccount savings = new SavingsAccount("S12345", "Skand", 1000.0, 5.0);
        System.out.println("Savings Account:");
        savings.displayBalance();
        savings.deposit(500);
        savings.addInterest();
        savings.displayBalance();
        savings.withdraw(300);
        savings.displayBalance();

        CurrentAccount current = new CurrentAccount("C54321", "Milind", 2000.0, 1000.0);
        System.out.println("\nCurrent Account:");
        current.displayBalance();
        current.deposit(700);
        current.withdraw(2500);
        current.displayBalance();
        current.withdraw(500);
        current.displayBalance();

        re.close();
    }
}
