package com.sda.javabyd3.mizi.JavaFX.exg009;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Michal Ziolecki.
 */
public class MainEx01 extends Application{
    public static void main(String[] args) {
        Application.launch( MainEx01.class, args );
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load( getClass().getResource( "../../../../../../ui_mizi/guiZad1egx009.fxml" ) );

        Scene scene = new Scene( root );
        Stage stage = new Stage(  );
        stage.setTitle( "Switcher by Michal" );
        stage.setScene( scene );
        stage.show();
    }
}
