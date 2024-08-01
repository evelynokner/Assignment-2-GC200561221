package ca.georgiancollege.assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class SplatoonDBController {

    @FXML
    private ComboBox<String> weapTypeComboBox;

    @FXML
    private ListView<Weapon> weaponList;

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
        weapTypeComboBox.getItems().add("Shooter");
        weapTypeComboBox.getItems().add("Charger");
        weapTypeComboBox.getItems().add("Painter");
        weapTypeComboBox.getSelectionModel().getSelectedItem();

        //sort list based on weapon type selected from weapTypeComboBox

    }
}
