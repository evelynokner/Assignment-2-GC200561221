package ca.georgiancollege.assignment2;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class JsonToString {

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        String content = Files.readString(Path.of(
                "src/main/resources/ca/georgiancollege/assignment2/splatoon-weapons.json"));
        System.out.println(content);
        Weapons w = gson.fromJson(content, Weapons.class);
        System.out.println(w.getWeapons());
    }
}
