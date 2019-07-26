package com.sda.javabyd3.mabr.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainWindow {
    @FXML
    Label label1;

    @FXML
    Label label2;

    @FXML
    Label label3;

   

    public void onClickMeButton(javafx.event.ActionEvent actionEvent) {
        label1.setText("Hello from button!");
        label2.setText("Hello from button!");
        label3.setText("Hello from button!");
    }
}
