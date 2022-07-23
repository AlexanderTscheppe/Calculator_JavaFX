package com.example.calculator_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;


public class HelloController {
    @FXML
    private TextArea textAreaInput1 = new TextArea(""); //Input-Area in the top left corner.
    @FXML
    private TextField textFieldOperation = new TextField(""); //Input-Field for the operation (+,-,*,/)
    @FXML
    private TextArea textAreaInput2 = new TextArea(""); //Input-Area in the top right corner
    @FXML
    private TextArea textAreaOutput = new TextArea(""); //Output-Area for the result, which can be copied into textAreaInput1
    private double input1 = 0d; //Inputvalue from textAreaInput1
    private double input2 = 0d; //Inputvalue from textAreaInput2
    private double output = 0d; //Outputvalue for textAreaOutput
    private boolean operation = false; //Boolean for checking whether an operation was applied or not
    private boolean firstNumber = false; //Boolean for checking whether an input exists in textAreaInput1
    private boolean bothNumbers = false; //Boolean for checking whether an input exists in textAreaInput1 and textAreaInput2



    //button0Pressed-button9Pressed: functions to recognize the pressing of the numerical buttons.
    @FXML
    private void button0Pressed() {
        if (operation == false) {
            textAreaInput1.setText(textAreaInput1.getText() + "0");
        } else {
            textAreaInput2.setText(textAreaInput2.getText() + "0");
        }
    }

    @FXML
    private void button1Pressed() {
        if (operation == false) {
            textAreaInput1.setText(textAreaInput1.getText() + "1");

        } else {
            textAreaInput2.setText(textAreaInput2.getText() + "1");
        }
    }

    @FXML
    private void button2Pressed() {
        if (operation == false) {
            textAreaInput1.setText(textAreaInput1.getText() + "2");

        } else {
            textAreaInput2.setText(textAreaInput2.getText() + "2");
        }
    }

    @FXML
    private void button3Pressed() {
        if (operation == false) {
            textAreaInput1.setText(textAreaInput1.getText() + "3");

        } else {
            textAreaInput2.setText(textAreaInput2.getText() + "3");
        }
    }

    @FXML
    private void button4Pressed() {
        if (operation == false) {
            textAreaInput1.setText(textAreaInput1.getText() + "4");

        } else {
            textAreaInput2.setText(textAreaInput2.getText() + "4");
        }
    }

    @FXML
    private void button5Pressed() {
        if (operation == false) {
            textAreaInput1.setText(textAreaInput1.getText() + "5");

        } else {
            textAreaInput2.setText(textAreaInput2.getText() + "5");
        }
    }

    @FXML
    private void button6Pressed() {
        if (operation == false) {
            textAreaInput1.setText(textAreaInput1.getText() + "6");

        } else {
            textAreaInput2.setText(textAreaInput2.getText() + "6");
        }
    }

    @FXML
    private void button7Pressed() {
        if (operation == false) {
            textAreaInput1.setText(textAreaInput1.getText() + "7");

        } else {
            textAreaInput2.setText(textAreaInput2.getText() + "7");
        }
    }

    @FXML
    private void button8Pressed() {
        if (operation == false) {
            textAreaInput1.setText(textAreaInput1.getText() + "8");

        } else {
            textAreaInput2.setText(textAreaInput2.getText() + "8");
        }
    }

    @FXML
    private void button9Pressed() {
        if (operation == false) {
            textAreaInput1.setText(textAreaInput1.getText() + "9");

        } else {
            textAreaInput2.setText(textAreaInput2.getText() + "9");
        }
    }



    @FXML
    private void buttonCommaPressed(){ //function to apply a decimal point to the number in die input-area
        if(operation == false){
            textAreaInput1.setText(textAreaInput1.getText() + ".");
        } else{
            textAreaInput2.setText(textAreaInput2.getText() + ".");
        }
    }
    @FXML
    private void buttonPlusPressed() { //function to apply a plus in the operation-field
        if (textFieldOperation.getText().equals("")) {
            textFieldOperation.setText("+");
            operation = true;
        }
    }

    @FXML
    private void buttonMinusPressed() { //function to apply a minus in the operation-field
        if (textFieldOperation.getText().equals("")) {
            textFieldOperation.setText("-");
            operation = true;
        }
    }

    @FXML
    private void buttonTimesPressed() { //function to apply a muliplication operator to the operation-field
        if (textFieldOperation.getText().equals("")) {
            textFieldOperation.setText("*");
            operation = true;
        }
    }

    @FXML
    private void buttonDividePressed() { //function to apply a division operatior to the operation-field
        if (textFieldOperation.getText().equals("")) {
            textFieldOperation.setText("/");
            operation = true;
        }
    }

    @FXML
    private void buttonClearPressed(){ //function to clear all textareas and textfields. Resets all values
        input1 = 0d;
        input2 = 0d;
        output = 0d;
        operation = false;
        firstNumber = false;
        bothNumbers = false;
        textAreaInput1.setText("");
        textAreaInput2.setText("");
        textFieldOperation.setText("");
        textAreaOutput.setText("");
    }
    @FXML
    private void buttonCopyPressed(){ //function to copy the result to textAreaInput1 for consecutive operations
        input1 = output;
        input2 = 0d;
        output = 0d;
        operation = false;
        firstNumber = true;
        bothNumbers = false;
        textAreaInput1.setText(Double.toString(input1));
        textAreaInput2.setText("");
        textFieldOperation.setText("");
        textAreaOutput.setText("");
    }
    @FXML
    private void buttonEnterPressed() { //function to apply the operator to the inputs
        if (firstNumber == true) {
            EnterPressed();
            Result();
            System.out.println(output);
        }
    }

    @FXML
    private void buttonOperationPressed(){ //function to switch from textAreaInput1 to textAreaInput2. Sets value of input1 to the given number
        if (firstNumber == false) {
            input1 = Double.parseDouble(textAreaInput1.getText());
            firstNumber = true;
        }

        }


    private void EnterPressed() { //function to set the value of input2 to the given number
        input2 = Double.parseDouble(textAreaInput2.getText());
        bothNumbers = true;

    }

    private double Result() { //function for applying the individual operations. Divison by 0 is prohibited
        if (textFieldOperation.getText().equals("+")) {
            output = input1 + input2;
            textAreaOutput.setText(Double.toString(output));
            return output;
        } else if(textFieldOperation.getText().equals("-")) {
            output = input1 - input2;
            textAreaOutput.setText(Double.toString(output));
            return output;
        } else if(textFieldOperation.getText().equals("*")) {
            output = input1*input2;
            textAreaOutput.setText(Double.toString(output));
            return output;
        } else if(textFieldOperation.getText().equals("/")) {
            if(input2 == 0) {
                textAreaOutput.setText("Division by 0 is not possible");
                return output;
            }else {
                output = input1/input2;
                textAreaOutput.setText(Double.toString(output));
                return output;
            }
        }
    return output;
    }

    }


