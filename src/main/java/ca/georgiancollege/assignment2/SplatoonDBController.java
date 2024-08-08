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
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class SplatoonDBController {

    Weapons weapons = null;

    @FXML
    private ComboBox<String> weapTypeComboBox;

    @FXML
    private ListView<String> weaponList;

//    @FXML public void handleMouseClick(MouseEvent mouseEvent) {
//        System.out.println("clicked on " + weaponList.getSelectionModel().getSelectedItem());
//    }

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
        // (action happens when combobox items get selected)
        weapTypeComboBox.valueProperty().addListener((_, oldItem, newItem) -> {
            if(!newItem.equals(oldItem)) fillWeaponList();
        });

        // add listener to list view
        weaponList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                Parent root = null;
                System.out.println("Selected item: " + newValue);
                Weapon selectedWeapon = findWeaponByName(newValue);
                WeaponData.setWeapon(selectedWeapon);
                try {
                    root = FXMLLoader.load(getClass().getResource("weapon-details-view.fxml"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                Stage stage = (Stage)weaponList.getScene().getWindow();
                stage.setScene(new Scene(root, 630, 540));

            }
        });

        // populate ListView with every weapon
        weapons = gson.fromJson(jsonString, Weapons.class);
        fillWeaponList();

        // 73 total weapons
        weapTypeComboBox.getItems().add("All");
        // 31 shooters
        weapTypeComboBox.getItems().add("Shooters");
        // 17 painters (brushes, rollers, sloshers)
        weapTypeComboBox.getItems().add("Painters");
        // 10 chargers
        weapTypeComboBox.getItems().add("Chargers");
        // 9 blasters
        weapTypeComboBox.getItems().add("Blasters");
        // 6 splatlings
        weapTypeComboBox.getItems().add("Splatlings");

    }

    private Weapon findWeaponByName(String newValue) {
        for(Weapon weapon : weapons.getWeapons()){
            if(weapon.getName().equals(newValue)){
                return weapon;
            }
        }
        return null;
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

}
