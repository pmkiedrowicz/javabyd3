package com.sda.javabyd3.kawa.javaFxKawaTest.test3;

import com.sda.javabyd3.kawa.exg009.ex02.FindNearestPrime;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class MainWindowForExg009Ex02 {
    public TextArea textToEnter;
    public Button findButton;
    public Label showResult;

    public void onButtonClick(ActionEvent actionEvent) {
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        showResult.setText(String.valueOf(findNearestPrime.findPrime(Integer.parseInt(textToEnter.getText()))));
    }
}
