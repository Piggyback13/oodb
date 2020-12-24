package Lab3;

import java.util.List;

public class MTS {
    private List<User> users;
    private List<TopUpBalance> topUpBalances;
    private List<MTSAccount> mtsAccounts;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<TopUpBalance> getTopUpBalances(TopUpBalance[] topUpBalances) {
        return this.topUpBalances;
    }

    public void setTopUpBalances(List<TopUpBalance> topUpBalances) {
        this.topUpBalances = topUpBalances;
    }

    public List<MTSAccount> getMtsAccounts() {
        return mtsAccounts;
    }

    public void setMtsAccounts(List<MTSAccount> mtsAccounts) {
        this.mtsAccounts = mtsAccounts;
    }

    @Override
    public String toString() {
        return "Lab3.MTS: " +
                ", users=" + users + '\n' +
                ", topUpBalances=" + topUpBalances + '\n' +
                ", mtsAccounts=" + mtsAccounts;
    }
}
