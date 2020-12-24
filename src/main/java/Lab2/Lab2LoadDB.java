package Lab2;

import Lab3.MTS;
import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Lab2LoadDB {
    public static MTS loadMtsList() throws IOException {
        String pStr = "";
        File file = new File("mts.json");

        if (file.exists()) {
            pStr = new String(Files.readAllBytes(file.toPath()));
        } else {
            System.out.println("File mts.json not found!");
        }

        System.out.println( pStr);

        Gson gson = new Gson();

        System.out.println(" ");

        MTS mts = gson.fromJson(pStr, MTS.class);

        System.out.println(mts);

        return mts;
    }

    public static void main(String[] args) throws IOException {
        loadMtsList();
    }

}
