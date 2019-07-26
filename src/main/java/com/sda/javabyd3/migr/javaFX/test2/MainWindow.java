package com.sda.javabyd3.migr.javaFX.test2;

import com.sda.javabyd3.migr.exg009.ex01.NumberConverter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainWindow {

    @FXML
    Button but1;
    @FXML
    TextField textField1;
    @FXML
    TextField textField2;

    public void onButtonClick(ActionEvent actionEvent) {

        NumberConverter nc = new NumberConverter();
        textField2.setText(nc.convertToString(Integer.parseInt(textField1.getText())));



    }
}
