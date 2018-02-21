import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    private BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    private double interestRate;
    private double interestEarned;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(final int setAccountNumber) {
        this.accountNumber = setAccountNumber;
    }

    public BankAccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(final BankAccountType setAccountType) {
        this.accountType = setAccountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(final double setAccountBalance) {
        this.accountBalance = setAccountBalance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(final String setOwnerName) {
        this.ownerName = setOwnerName;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(final double setInterestRate) {
        this.interestRate = setInterestRate;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public void setInterestEarned(final double setInterestEarned) {
        this.interestEarned = setInterestEarned;
    }


    public BankAccount(final String name, final BankAccountType setAccountCategory) {
        ownerName = name;
        accountType = setAccountCategory;
        Bank.totalAccounts++;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}