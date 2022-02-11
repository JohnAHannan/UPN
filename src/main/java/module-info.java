module com.example.upn {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.upn to javafx.fxml;
    exports com.example.upn;
}