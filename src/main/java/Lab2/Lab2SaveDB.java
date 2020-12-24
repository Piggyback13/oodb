package Lab2;

import Lab3.User;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class Lab2SaveDB {
    public static void saveUserList(List<User> users) throws IOException {
        if (users != null && users.size() > 0) {
            Gson gson = new Gson();
            String usersAsJson = gson.toJson(users);
            System.out.println(usersAsJson);

            try (OutputStream os = new FileOutputStream(new File("mts.json"))) {
                os.write(usersAsJson.getBytes("UTF-8"));
                os.flush();
            }
        }
    }
}
