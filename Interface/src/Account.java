
import java.util.ArrayList;
import java.util.List;

public class Account implements BankingService {
    private String accountId;
    private double balance;
    private List<Transaction> transactions;

    public Account(String accountId) {
        this.accountId = accountId;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    @Override
    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount: " + amount);
            return false;
        }
        balance += amount;
        logTransaction("DEPOSIT", amount);
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount: " + amount);
            return false;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal of: " + amount);
            return false;
        }
        balance -= amount;
        logTransaction("WITHDRAW", amount);
        return true;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    private void logTransaction(String type, double amount) {
        transactions.add(new Transaction(type, amount));
        System.out.println("Transaction recorded: " + type + " ₹" + amount);
    }

    public List<Transaction> getTransactionHistory() {
        return transactions;
    }
}