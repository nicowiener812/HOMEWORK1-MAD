public class StandardAccount implements IAccount {
    private int accountNumber;
    private double balance;
    private double creditLimit;

    public StandardAccount(int accountNumber, double creditLimit) {
        this.accountNumber = accountNumber;
        this.creditLimit = (creditLimit < 0) ? creditLimit : 0;
        this.balance = 0;
    }

    public void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double Withdraw(double amount) {
        if (amount < 0) {
            return 0;
        }
        if (amount > (balance + creditLimit)) {
            double maxWithdrawal = balance + creditLimit;
            balance = creditLimit;
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

