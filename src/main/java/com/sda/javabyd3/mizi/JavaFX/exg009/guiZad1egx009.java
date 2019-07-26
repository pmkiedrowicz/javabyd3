package com.sda.javabyd3.mizi.JavaFX.exg009;

import com.sda.javabyd3.mizi.exg009.ex01.NumberConverter;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


/**
 * Created by Michal Ziolecki.
 */
public class guiZad1egx009 {
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
        NumberConverter numberConverter = new NumberConverter();
        Integer inPut = Integer.parseInt( textField.getText() ) ;
        String returnNumberLikeString = numberConverter.convertToString( inPut );
        labelAnswer.setText( returnNumberLikeString );

    }


    public void textFieldGetAction(KeyEvent keyEvent){

        if(keyEvent.getCode() == KeyCode.ENTER)
        {
            NumberConverter numberConverter = new NumberConverter();
            Integer inPut = Integer.parseInt( textField.getText() ) ;
            String returnNumberLikeString = numberConverter.convertToString( inPut );
            labelAnswer.setText( returnNumberLikeString );
        }
    }


}
