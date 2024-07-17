module ca.georgiancollege.assignment2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgiancollege.assignment2 to javafx.fxml;
    exports ca.georgiancollege.assignment2;
}