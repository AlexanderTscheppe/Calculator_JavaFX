package com.example.calculator_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.application.Platform;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Button buttonEnter = new Button();

    @FXML
    public void onHelloButtonClick() {
        buttonEnter.setOnAction((ActionEvent event) -> {
        Stage stage = (Stage) buttonEnter.getScene().getWindow();
        stage.close();
       });
    }
}