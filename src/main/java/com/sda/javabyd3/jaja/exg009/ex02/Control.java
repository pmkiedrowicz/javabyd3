package com.sda.javabyd3.jaja.exg009.ex02;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Control {

    @FXML
    TextField text;
    @FXML
    Label answer;
    @FXML
    Button button;
    public void kliknij(ActionEvent actionEvent) {
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        String userAnswer = text.getText();
        Integer number = Integer.parseInt(userAnswer);
        Integer findNumber = findNearestPrime.findPrime(number);
        String text2 = findNumber.toString();
        answer.setText(text2);
    }
}
