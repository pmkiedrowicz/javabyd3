package com.sda.javabyd3.syga.exg009.ex01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;

public class MainEx01_009 {

    @FXML
    Label pole;

    public void onClickMeButtom(ActionEvent actionEvent) {
        pole.setText("");
    }
}
