package com.example.java_29_comparsa_di_nuova_scritta_tramite_bottone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onChangeTextButtonAction() {
        welcomeText.setText("the text has changed");
    }
}