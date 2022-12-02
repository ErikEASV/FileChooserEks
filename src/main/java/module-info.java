module com.example.filechoosereks {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.filechoosereks to javafx.fxml;
    exports com.example.filechoosereks;
}