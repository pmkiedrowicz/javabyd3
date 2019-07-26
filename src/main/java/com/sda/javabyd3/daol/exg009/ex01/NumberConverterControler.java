package com.sda.javabyd3.daol.exg009.ex01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class NumberConverterControler {

    @FXML
    TextField wprowadzanie1;

    @FXML
    Button button1;

    @FXML
    Label liczbaslownie1;

    public void ZamienNaTekst(ActionEvent actionEvent) {
        NumberConverter numberConverter = new NumberConverter();
        String wprowadzenie = wprowadzanie1.getText();
        Integer number = Integer.parseInt(wprowadzenie);
        liczbaslownie1.setText(numberConverter.convertToString(number));



    }
}
