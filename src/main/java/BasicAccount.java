public class BasicAccount implements IAccount {
    private int accountNumber;
    private double balance;
    private double withdrawalLimit;

    public BasicAccount(int accountNumber, double withdrawalLimit) {
        this.accountNumber = accountNumber;
        this.withdrawalLimit = (withdrawalLimit > 0) ? withdrawalLimit : 0;
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
        double withdrawalAmount = Math.min(amount, withdrawalLimit);
        if (withdrawalAmount > balance) {
            withdrawalAmount = balance;
        }
        balance -= withdrawalAmount;
        return withdrawalAmount;
    }

    public double GetCurrentBalance() {
        return balance;
    }

    public int GetAccountNumber() {
        return accountNumber;
    }
}
