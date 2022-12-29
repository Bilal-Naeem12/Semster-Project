module com.example.semsterproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.semsterproject to javafx.fxml;
    exports com.example.semsterproject;
    exports com.example.semsterproject.Classes;
    opens com.example.semsterproject.Classes to javafx.fxml;


}