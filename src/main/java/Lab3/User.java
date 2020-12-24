package Lab3;

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
        return super.toString() + " Lab3.User: " + getLastName() +
                '\n';
    }


}
