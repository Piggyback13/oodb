package Lab3;

import java.util.Date;

public class TopUpBalance {
    private MTSAccount mtsAccount;
    private Date topUpBalanceDate;
    private User user;
    private double sum;
    public TopUpBalance(MTSAccount mtsAccount, User user, double sum) {
        this.mtsAccount = mtsAccount;
        this.topUpBalanceDate = new Date();
        this.user = user;
        this.sum = sum;
        if (sum > 0) {
            growthBalance(sum);
        } else {
            decreaseBalance(sum);
        }
    }
    public TopUpBalance() {
    }
    private void growthBalance(double sum) {
        mtsAccount.growthBalance(sum);
    }
    private boolean decreaseBalance(double sum) {
        return mtsAccount.decreaseBalance(sum);
    }

    public MTSAccount getMtsAccount() {
        return mtsAccount;
    }

    public void setMtsAccount(MTSAccount mtsAccount) {
        this.mtsAccount = mtsAccount;
    }

    public Date getTopUpBalanceDate() {
        return topUpBalanceDate;
    }

    public void setTopUpBalanceDate(Date topUpBalanceDate) {
        this.topUpBalanceDate = topUpBalanceDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }


    @Override
    public String toString() {
        return "Lab3.TopUpBalance{" +
                "mtsAccount=" + mtsAccount.toString()+
                ", topUpBalanceDate=" + topUpBalanceDate.toString() +
                ", user=" + user.toString() +
                ", sum=" + sum +
                '}';
    }
}
