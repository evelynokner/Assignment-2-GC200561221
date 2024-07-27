module ca.georgiancollege.assignment2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgiancollege.assignment2 to javafx.fxml, com.google.gson;
    exports ca.georgiancollege.assignment2;
}