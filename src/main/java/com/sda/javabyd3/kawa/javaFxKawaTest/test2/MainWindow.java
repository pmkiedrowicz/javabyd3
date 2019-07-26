package com.sda.javabyd3.kawa.javaFxKawaTest.test2;

import com.sda.javabyd3.kawa.exg009.ex01.NumberConverter;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class MainWindow {


    public TextArea textToEnter;
    public Button buttonToCheck;
    public Label labelWynik;

    public void onButtonClick(javafx.event.ActionEvent actionEvent) {
        NumberConverter numberConverter = new NumberConverter();
        labelWynik.setText(numberConverter.converToString(Integer.parseInt(textToEnter.getText())));
    }
}
