Mobile Apps Development – Homework 1

Author: Nicolas Wiener - 807137


Overview -------------------------------------------------------------------------------

This Java application models a simplified banking system featuring three distinct types
of accounts: PremiumAccount, BasicAccount, and StandardAccount, all conforming to
the IAccount interface which defines essential banking operations such as deposits,
withdrawals, and balance inquiries. The project introduces a Bank class implementing
the IBank interface, serving as a unified manager for handling multiple accounts.

Account Classes ------------------------------------------------------------------------

The account classes exhibit shared and unique characteristics.

- Shared Features:

Account Interface: All account types implement the IAccount interface, ensuring
uniform method signatures for Deposit, Withdraw, GetCurrentBalance, and
GetAccountNumber.

Private Attributes and Constructors: Private attributes include accountNumber,
currentBalance, and type-specific properties like creditLimit or withdrawLimit.
Constructors initialize these attributes, setting currentBalance to an initial value.

Balance Management: A private method, UpdateCurrentBalance, manages balance
updates post-transactions, promoting encapsulation.

- Unique Account Features:

PremiumAccount: Allows unrestricted deposits and withdrawals, adjusting the balance
directly without limits.

StandardAccount: Enforces a withdrawal limit based on the currentBalance plus a
creditLimit, restricting withdrawals accordingly.

BasicAccount: Withdrawals are constrained by a predefined withdrawLimit, reflecting
the account's balance and credit limit.

Bank Class --------------------------------------------------------------------------

The Bank class orchestrates account management through the IBank interface:
Account Management: Maintains a list of IAccount instances for comprehensive
account oversight.

Opening and Closing Accounts: Facilitates account registrations (OpenAccount) and
closures (CloseAccount), ensuring account balance criteria are met for closures.

Account Queries: Implements methods like GetAllAccounts, GetAllAccountsInDebt,
and GetAllAccountsWithBalance to fetch accounts based on specific conditions (e.g.,
debt status or minimum balance).

Main Class Demonstration -------------------------------------------------------------

The Main class demonstrates the application's capabilities by:

• Instantiating various account types and registering them with the bank.
• Performing transactions (deposits and withdrawals) across accounts.
• Displaying account balances, identifying accounts in debt, and showcasing the
dynamic interaction between the bank and its accounts.

Getting Started --------------------------------------------------------------------

Clone the repository to your local machine and navigate to the project directory. Ensure
Java is installed and compile the source files. Run the Main class to observe the banking
system in action.
