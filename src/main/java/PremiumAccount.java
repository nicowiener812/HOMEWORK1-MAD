public class PremiumAccount implements IAccount {
    private int accountNumber;
    private double balance;

    public PremiumAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    @Override
    public void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double Withdraw(double amount) {
        if (amount < 0) {
            return 0;
        }
        if (amount > balance) {
            double maxWithdrawal = balance;
            balance = 0;
            return maxWithdrawal;
        } else {
            balance -= amount;
            return amount;
        }
    }

    public double GetCurrentBalance() {
        return balance;
    }

    public int GetAccountNumber() {
        return accountNumber;
    }
}

