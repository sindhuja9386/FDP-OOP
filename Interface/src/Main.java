
public class Main {
    public static void main(String[] args) {
        BankingService acct = new Account("ACCT123");

        // TC1: Deposit ₹1000
        System.out.println("TC1: Deposit ₹1000 → " + acct.deposit(1000) + ", Balance = ₹" + acct.getBalance());
        
        // TC2: Withdraw ₹500
        System.out.println("TC2: Withdraw ₹500 → " + acct.withdraw(500) + ", Balance = ₹" + acct.getBalance());
        
        // TC3: Withdraw ₹1500 (should fail)
        System.out.println("TC3: Withdraw ₹1500 → " + acct.withdraw(1500) + ", Balance = ₹" + acct.getBalance());
        
        // TC4: Deposit negative amount (should fail)
        System.out.println("TC4: Deposit -₹100 → " + acct.deposit(-100) + ", Balance = ₹" + acct.getBalance());
        
        // TC5: Transaction history
        System.out.println("TC5: Transaction History:");
        ((Account) acct).getTransactionHistory()
            .forEach(System.out::println);
    }
}
