package Lab2;

import Lab3.MTS;
import Lab3.MTSAccount;
import Lab3.TopUpBalance;
import Lab3.User;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();

        MTS mts1 = new MTS();

        User[] users = new User[2];
        users[0] = new User("Yegor", "Glezdenyov", "89124611013", "21.04.2000");
        users[1] = new User("Evgeniya", "Lepikhina", "89128430388", "29.09.2000");

        MTSAccount[] mtsAccounts = new MTSAccount[2];
        mtsAccounts[0] = new MTSAccount(000001);
        mtsAccounts[1] = new MTSAccount(000002);

        TopUpBalance[] topUpBalances = new TopUpBalance[2];
        topUpBalances[0] = new TopUpBalance(mtsAccounts[0], users[0], 1000);
        topUpBalances[1] = new TopUpBalance(mtsAccounts[1], users[1], 1500);

        mts1.setUsers(Arrays.asList(users));
        mts1.setMtsAccounts(Arrays.asList(mtsAccounts));
        mts1.setTopUpBalances(Arrays.asList(topUpBalances));

        String json1 = gson.toJson(mts1);

        try (OutputStream os = new FileOutputStream(new File("mts.json"))) {
            os.write(json1.getBytes("UTF-8"));
            os.flush();
        }


        MTS mts = Lab2LoadDB.loadMtsList();



        /*String json = "{\"firstName\":\"Yegor\",\"lastName\":\"Glezdenyov\",\"phoneNumber\":\"89124611013\",\"birthDate\":\"21.04.2000\"}";
        Lab3.User user1 = gson.fromJson(json, Lab3.User.class);
        System.out.println(user1);

*/
    }
}