package Lab1;

import java.util.List;

public class MTS {
    private String name;
    private List<User> users;
    private List<TopUpBalance> topUpBalances;
    private List<MTSAccount> mtsAccounts;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getClients() {
        return users;
    }

    public void setClients(List<User> users) {
        this.users = users;
    }

    public List<TopUpBalance> getTopUpBalances() {
        return topUpBalances;
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
        return "Bank: " +
                "name='" + name + '\n' +
                ", clients=" + users + '\n' +
                ", transactions=" + topUpBalances + '\n' +
                ", bankAccounts=" + mtsAccounts;
    }
}
