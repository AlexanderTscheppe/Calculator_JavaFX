package com.example.calculator_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;


public class HelloController {
    @FXML
    private TextArea textAreaInput1 = new TextArea("");
    @FXML
    private TextField textFieldOperation = new TextField("");
    @FXML
    private TextArea textAreaInput2 = new TextArea("");
    @FXML
    private TextArea textAreaOutput = new TextArea("");
    /* @FXML
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
    private Button button9 = new Button(); */
    private double input1 = 0d;
    private double input2 = 0d;
    private double output = 0d;
    private boolean operation = false;
    private boolean firstNumber = false;


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
    private void buttonPlusPressed() {
        if (textFieldOperation.getText().equals("")) {
            textFieldOperation.setText("+");
            operation = true;
        }
    }

    @FXML
    private void buttonMinusPressed() {
        if (textFieldOperation.getText().equals("")) {
            textFieldOperation.setText("-");
            operation = true;
        }
    }

    @FXML
    private void buttonTimesPressed() {
        if (textFieldOperation.getText().equals("")) {
            textFieldOperation.setText("*");
            operation = true;
        }
    }

    @FXML
    private void buttonDividePressed() {
        if (textFieldOperation.getText().equals("")) {
            textFieldOperation.setText("/");
            operation = true;
        }
    }

    @FXML
    private void buttonEnterPressed() {
        if (firstNumber == true) {
            Result();
            System.out.println(output);
        }
    }

    @FXML
    private void buttonOperationPressed() {
        if (firstNumber == false) {
            input1 = Double.parseDouble(textAreaInput1.getText());
            firstNumber = true;
            System.out.println(input1);
        } else {
            EnterPressed();

        }
    }

    private void EnterPressed() {
        input2 = Double.parseDouble(textAreaInput2.getText());
        System.out.println(input2);

    }

    private double Result() {
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
            if(input2 == 0){
                textAreaOutput.setText("Division by 0 is not possible");
                return output;
        } else {
                output = input1/input2;
                textAreaOutput.setText(Double.toString(output));
                return output;
            }
    }
        return output;
    }
}

