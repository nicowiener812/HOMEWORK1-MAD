import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank implements IBank {
    private List<IAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void OpenAccount(IAccount account) {

        accounts.add(account);

    }

    public void CloseAccount(int accountNumber) {
        Iterator<IAccount> iterator = accounts.iterator();
        while (iterator.hasNext()) {
            IAccount account = iterator.next();
            if (account.GetAccountNumber() == accountNumber) {
                if (account.GetCurrentBalance() >= 0) {
                    iterator.remove();
                } else {
                    System.out.println("Account not closed due to debt.");
                }
                return;
            }
        }
    }

    public List<IAccount> GetAllAccounts() {
        return accounts;
    }

    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> debtAccounts = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() < 0) {
                debtAccounts.add(account);
            }
        }
        return debtAccounts;
    }

    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> accountsWithBalanceAbove = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() > balanceAbove) {
                accountsWithBalanceAbove.add(account);
            }
        }
        return accountsWithBalanceAbove;
    }
}
