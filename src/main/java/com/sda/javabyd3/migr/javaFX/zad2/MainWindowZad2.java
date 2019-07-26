package com.sda.javabyd3.migr.javaFX.zad2;

import com.sda.javabyd3.migr.exg009.ex02.FindNearestPrime;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class MainWindowZad2 {

    @FXML
    Button but1;
    @FXML
    TextField textIn;
    @FXML
    TextField textOut;



    public void onBut1Action(ActionEvent actionEvent) {
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        textOut.setText(String.valueOf(findNearestPrime.findPrime(Integer.parseInt(textIn.getText()))));


    }
}
