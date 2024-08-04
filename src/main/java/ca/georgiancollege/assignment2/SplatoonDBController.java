package ca.georgiancollege.assignment2;

import com.google.gson.Gson;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class SplatoonDBController {
    Weapons weapons = null;

    @FXML
    private ComboBox<String> weapTypeComboBox;


    @FXML
    private ListView<String> weaponList;

//    @FXML
//    void openWeaponDetailsView(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("weapon-details-view.fxml"));
//        Stage stage = (Stage)tableButton.getScene().getWindow();
//        stage.setScene(new Scene(root, 630, 540));
//    }

    @FXML public void handleMouseClick(MouseEvent mouseEvent) {
        System.out.println("clicked on " + weaponList.getSelectionModel().getSelectedItem());
    }

    @FXML
    public void initialize(){
        Gson gson = new Gson();
        String jsonString = null;
        try {
            jsonString = Files.readString(Path.of(
                    "src/main/resources/ca/georgiancollege/assignment2/splatoon-weapons.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // add listener to combobox
        weapTypeComboBox.valueProperty().addListener((_, oldItem, newItem) -> {
            if(!newItem.equals(oldItem)) fillWeaponList();

        });
        // add listener to list view
        weaponList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                // Your action here
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("weapon-details-view.fxml"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Stage stage = (Stage)weaponList.getScene().getWindow();
                stage.setScene(new Scene(root, 630, 540));
                System.out.println("Selected item: " + newValue);
            }
        });

        // populate ListView with every weapon
        weapons = gson.fromJson(jsonString, Weapons.class);
        fillWeaponList();

        // 73 total weapons
        weapTypeComboBox.getItems().add("All");
        // 31 shooters
        weapTypeComboBox.getItems().add("Shooters");
        // 17 painters
        weapTypeComboBox.getItems().add("Painters");
        // 10 chargers
        weapTypeComboBox.getItems().add("Chargers");
        // 9 blasters
        weapTypeComboBox.getItems().add("Blasters");
        // 6 splatlings
        weapTypeComboBox.getItems().add("Splatlings");




        //sort list based on weapon type selected from weapTypeComboBox

        String selectedWeaponType = weapTypeComboBox.getSelectionModel().getSelectedItem();
//        Weapon weapon = new Weapon();
//
//        if(selectedWeaponType != null && (!selectedWeaponType.equals(weapon.getType()))
//                && !selectedWeaponType.equals("All")) continue;


    }

    private void fillWeaponList(){
        String selectedWeaponType = weapTypeComboBox.getSelectionModel().getSelectedItem();
        weaponList.getItems().clear();
        for(Weapon weapon : weapons.getWeapons()){
            String weaponType = weapon.getType();
            if(selectedWeaponType != null && !selectedWeaponType.equals(weaponType)
            && !selectedWeaponType.equals("All")) continue;
            weaponList.getItems().add(weapon.getName());
        }
    }
    static void JsonToObject() throws FileNotFoundException {
       /* JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("c:\\splatoon-weapons.json"));

        for (Object obj : jsonArray)
        {
            JSONObject weapon = (JSONObject) obj;

            String name = (String) weapon.get("name");
            System.out.println(name);

            String special = (String) weapon.get("special");
            System.out.println(special);

            String matchmakingRange = (String) weapon.get("matchmakingRange");
            System.out.println(matchmakingRange);

            String specialPoints = (String) weapon.get("specialPoints");
            System.out.println(specialPoints);

            //shooter
            String specialPoints = (String) weapon.get("specialPoints");
            System.out.println(specialPoints);

            String specialPoints = (String) weapon.get("specialPoints");
            System.out.println(specialPoints);

            //painter
            String specialPoints = (String) weapon.get("specialPoints");
            System.out.println(specialPoints);

            String specialPoints = (String) weapon.get("specialPoints");
            System.out.println(specialPoints);

            //charger
            String specialPoints = (String) weapon.get("specialPoints");
            System.out.println(specialPoints);

            String specialPoints = (String) weapon.get("specialPoints");
            System.out.println(specialPoints);
        }*/
    }
}
