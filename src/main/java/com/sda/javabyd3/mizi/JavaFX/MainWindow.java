package com.sda.javabyd3.mizi.JavaFX;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

;

/**
 * Created by Michal Ziolecki.
 */
public class MainWindow{

    //fx:controller="com.sda.javabyd3.mizi.JavaFX.MainWindow"
    @FXML
    Label label1;
    @FXML
    Label label2;
    @FXML
    Label label3;

    public void onClickeMeButton(ActionEvent actionEvent) {
        label1.setText( "Hello 1" );
        label2.setText( "Hello 2 ");
        label3.setText( "Hello 3" );
    }
}
