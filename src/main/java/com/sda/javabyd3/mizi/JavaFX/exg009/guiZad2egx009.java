package com.sda.javabyd3.mizi.JavaFX.exg009;

import com.sda.javabyd3.mizi.exg009.ex01.NumberConverter;
import com.sda.javabyd3.mizi.exg009.ex02.FindNearestPrime;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


/**
 * Created by Michal Ziolecki.
 */
public class guiZad2egx009 {
    //fx:controller="com.sda.javabyd3.mizi.JavaFX.exg009general.guiZad1exg009"
    @FXML
    Label labelWhereAnswer;
    @FXML
    Label labelAnswer;
    @FXML
    Button buttonZmien;
    @FXML
    TextField textField;

    public void clickMeButtonToSwitch(ActionEvent actionEvent)
    {
        FindNearestPrime findNearestPrime = new FindNearestPrime();
        Integer inPut = Integer.parseInt( textField.getText() ) ;
        Integer returnNumber = findNearestPrime.findPrime( inPut );
        labelAnswer.setText( String.valueOf( returnNumber ) );
    }

    public void textFieldGetAction(KeyEvent keyEvent){

        if(keyEvent.getCode() == KeyCode.ENTER)
        {
            FindNearestPrime findNearestPrime = new FindNearestPrime();
            Integer inPut = Integer.parseInt( textField.getText() ) ;
            Integer returnNumber = findNearestPrime.findPrime( inPut );
            labelAnswer.setText( String.valueOf( returnNumber ) );
        }
    }


}
