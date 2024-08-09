package ca.georgiancollege.assignment2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("splatoonDB-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 630, 540);
        stage.setTitle("Splatoon 3 Weapons Database");
        stage.getIcons().add(new Image("file:src/main/resources/images/splatoon-logo.png"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}