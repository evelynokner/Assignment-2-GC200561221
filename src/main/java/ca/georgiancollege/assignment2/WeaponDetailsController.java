package ca.georgiancollege.assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;

//import static com.apple.eio.FileManager.getResource;

public class WeaponDetailsController {

    @FXML
    private Button backButton;

    @FXML
    private Label weapNameLabel, weapTypeLabel2,
            specialLabel, specialPointsLabel, mmRangeLabel, rangeLabel,
            parameter1, parameter1Label, parameter2, parameter2Label;

    @FXML
    private ImageView weaponPic;

    @FXML
    void handleBackButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("splatoonDB-view.fxml"));
        Stage stage = (Stage)backButton.getScene().getWindow();
        stage.setScene(new Scene(root, 630, 540));
    }

    @FXML
    public void initialize() throws FileNotFoundException {
        Weapon weapon = WeaponData.getWeapon();
        String imageName = null;
        if (weapon != null) {
            weapNameLabel.setText(weapon.getName());
            weapTypeLabel2.setText(weapon.getType());
            specialLabel.setText(weapon.getSpecial());
            specialPointsLabel.setText(weapon.getSpecialPoints() +"");
            mmRangeLabel.setText(weapon.getMatchmakingRange() +"");
            rangeLabel.setText(weapon.getRange()+"");
            parameter1Label.setText("");
            parameter2Label.setText("");
            weaponPic.setImage(new Image("file:src/main/resources/images/" + weapon.getImage()));
        }

//        ClassLoader classLoader = getClass().getClassLoader();
//        URL resourceFolder = classLoader.getResource("images");
//        URL resource = classLoader.getResource("/images/52gal.png");
//        String imageUrl = String.valueOf(resource);

    }
}