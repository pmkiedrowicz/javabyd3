package com.sda.javabyd3.syga.testjavafx.test2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class MainWindow {
    @FXML
    Label label1;
    @FXML
    Label label2;
    @FXML
    Label label3;

    public void onClickMeButtom(ActionEvent actionEvent) {
        label1.setText("Hello from buttom");
        label2.setText("Hello from buttom");
        label3.setText("Hello from buttom");
    }
}
