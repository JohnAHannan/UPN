module com.example.upn {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.upn to javafx.fxml;
    exports com.example.upn;
}