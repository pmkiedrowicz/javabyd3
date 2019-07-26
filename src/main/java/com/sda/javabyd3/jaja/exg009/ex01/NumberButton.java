package com.sda.javabyd3.jaja.exg009.ex01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NumberButton {

    @FXML
    Label odpowiedz;

    @FXML
    Button kliknij;

    @FXML
    TextField text;

    public void kliknijMnie(ActionEvent actionEvent) {
        NumberConverter numberConverter = new NumberConverter();
        String answer = text.getText();
        Integer number = Integer.parseInt(answer);
        odpowiedz.setText(numberConverter.convertToString(number));

    }
}
