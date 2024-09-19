module com.example.databae {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.databae to javafx.fxml;
    exports com.example.databae;
}