package Lab2;

import Lab3.Person;
import Lab3.User;

import java.util.List;

public class UserService {
    public static Person findUserByName(List<User> users, String searchName) {
        User result = null;

        for (User user : users) {
            if (user.getFirstName().equals(searchName)) {
                result = user;
            }
        }

        return result;
    }

}
