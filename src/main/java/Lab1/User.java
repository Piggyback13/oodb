package Lab1;

import java.util.List;

public class User extends Person {

    public User(String firstName, String lastName, String phoneNumber, String birthDate) {
        super(firstName, lastName, phoneNumber, birthDate);
    }
    public User() {
    }
    private List<MTSAccount> accounts;
    public List<MTSAccount> getAccounts() {
        return accounts;
    }
    public void setAccounts(List<MTSAccount> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "User: " + getLastName() +
                ", accounts=" + accounts +
                '\n';
    }


}
