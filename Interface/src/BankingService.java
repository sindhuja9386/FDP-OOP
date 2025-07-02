
public interface BankingService {
    boolean deposit(double amount);
    boolean withdraw(double amount);
    double getBalance();
}
