package com.example.calculator_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;


public class HelloController {
    @FXML
    private TextArea textAreaInput = new TextArea("");
    @FXML
    private Button button0 = new Button();
    @FXML
    private Button button1 = new Button();
    @FXML
    private Button button2 = new Button();
    @FXML
    private Button button3 = new Button();
    @FXML
    private Button button4 = new Button();
    @FXML
    private Button button5 = new Button();
    @FXML
    private Button button6 = new Button();
    @FXML
    private Button button7 = new Button();
    @FXML
    private Button button8 = new Button();
    @FXML
    private Button button9 = new Button();


    @FXML
    private void button0Pressed(){
        if(textAreaInput.getText() != null) {
            textAreaInput.setText(textAreaInput.getText() + "0");
        }
    }
    @FXML
    private void button1Pressed(){
        if(textAreaInput.getText() != null) {
            textAreaInput.setText(textAreaInput.getText() + "1");
        }
    }
    @FXML
    private void button2Pressed(){
        if(textAreaInput.getText() != null) {
            textAreaInput.setText(textAreaInput.getText() + "2");
        }
    }
    @FXML
    private void button3Pressed(){
        if(textAreaInput.getText() != null) {
            textAreaInput.setText(textAreaInput.getText() + "3");
        }
    }
    @FXML
    private void button4Pressed(){
        if(textAreaInput.getText() != null) {
            textAreaInput.setText(textAreaInput.getText() + "4");
        }
    }
    @FXML
    private void button5Pressed(){
        if(textAreaInput.getText() != null) {
            textAreaInput.setText(textAreaInput.getText() + "5");
        }
    }
    @FXML
    private void button6Pressed(){
        if(textAreaInput.getText() != null) {
            textAreaInput.setText(textAreaInput.getText() + "6");
        }
    }
    @FXML
    private void button7Pressed(){
        if(textAreaInput.getText() != null) {
            textAreaInput.setText(textAreaInput.getText() + "7");
        }
    }
    @FXML
    private void button8Pressed(){
        if(textAreaInput.getText() != null) {
            textAreaInput.setText(textAreaInput.getText() + "8");
        }
    }
    @FXML
    private void button9Pressed(){
        if(textAreaInput.getText() != null) {
            textAreaInput.setText(textAreaInput.getText() + "9");
        }
    }








    }

