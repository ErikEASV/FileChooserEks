package com.example.filechoosereks;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


import java.io.File;

public class HelloController {
    @FXML
    public VBox minvbox;
    @FXML
    private Label welcomeText;

    final FileChooser fileChooser = new FileChooser();
    @FXML
    protected void onHelloButtonClick() {
        Stage stage = (Stage) minvbox.getScene().getWindow();
        File file = fileChooser.showOpenDialog(stage);
        System.out.println("Valgt filnavn: " + file.getName());


    }
}