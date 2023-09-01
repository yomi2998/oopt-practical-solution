package P6.Q1;
import java.util.Date;

public class Account {
    private String accountNumber;
    private double balance;
    private Date dateCreated;

    Account() {}

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}

class SavingsAccount extends Account {
    private static double interestRate = 0.05;

    SavingsAccount() {}

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        SavingsAccount.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    public void updateInterest() {
        setBalance(getBalance() + calculateInterest());
    }
}

class CurrentAccount extends Account {
    private static int freeTransactions = 5;
    private static double transactionFee = 1.0;
    private int transactionCount = 0;

    CurrentAccount() {}

    public static int getFreeTransactions() {
        return freeTransactions;
    }

    public static double getTransactionFee() {
        return transactionFee;
    }

    public static void setFreeTransactions(int freeTransactions) {
        CurrentAccount.freeTransactions = freeTransactions;
    }

    public static void setTransactionFee(double transactionFee) {
        CurrentAccount.transactionFee = transactionFee;
    }

    public void deposit(double amount) {
        if(amount < 0) {
            System.out.println("Invalid amount.");
            return;
        }
        super.deposit(amount);
        transactionCount++;
        deductFees();
    }

    public void withdraw(double amount) {
        if(amount < 0 || amount > getBalance()) {
            System.out.println("Invalid amount.");
            return;
        }
        super.withdraw(amount);
        transactionCount++;
        deductFees();
    }

    private void deductFees() {
        if (transactionCount > freeTransactions) {
            System.out.printf("Transaction fee of RM %.2f will be charged on your account.\n", transactionFee);
            setBalance(getBalance() - transactionFee);
        }
    }

    public void resetTransactionCount() {
        transactionCount = 0;
    }
}