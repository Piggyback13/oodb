package Lab1;

public class MTSAccount {
    private long accountNumber;
    private double balance;
    public MTSAccount(long accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    public MTSAccount() {
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    protected void growthBalance(double money) {
        this.balance += money;
    }
    protected boolean decreaseBalance(double money) {
        if (balance < money) {
            return false;
        } else {
            this.balance -= money;
            return true;
        }
    }

    @Override
    public String toString() {
        return "MTSAccount:" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '\n';
    }
}
