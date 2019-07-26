package com.sda.javabyd3.daol.exg009.ex02.fx;

import com.sda.javabyd3.daol.exg009.ex02.FindNearestPrime;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class Controler {

    @FXML
    Label label1;

    @FXML
    Label label2;

    @FXML
    TextField textField;

    @FXML
    Button button;

    public void generateNearestPrime(ActionEvent actionEvent) {

            FindNearestPrime findNearestPrime = new FindNearestPrime();
            String text = textField.getText();
            Integer number = Integer.parseInt(text);
            Integer nearestNumber = findNearestPrime.findPrime(number);
            String text2 = nearestNumber.toString();
            label2.setText(text2);
        }

    public void textFieldGetAction(KeyEvent keyEvent){
        if (keyEvent.getCode() == KeyCode.ENTER) {
            FindNearestPrime findNearestPrime = new FindNearestPrime();
            String text = textField.getText();
            Integer number = Integer.parseInt(text);
            Integer nearestNumber = findNearestPrime.findPrime(number);
            String text2 = nearestNumber.toString();
            label2.setText(text2);
        }
    }
}
