package ca.georgiancollege.assignment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class WeaponDetailsController {

    @FXML
    private Button backButton;

    @FXML
    private Label weapNameLabel, weapTypeLabel,
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
    public void initialize(){
        specialLabel.setText("");
        specialPointsLabel.setText("");
        mmRangeLabel.setText("");
        rangeLabel.setText("");
        parameter1Label.setText("");
        parameter2Label.setText("");
    }
}