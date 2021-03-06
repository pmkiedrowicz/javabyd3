package com.sda.javabyd3.mizi.JavaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Michal Ziolecki.
 */
public class Main extends Application{
    public static void main(String[] args) {
        Application.launch( Main.class, args );
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load( getClass().getResource( "../../../../../ui_mizi/mainWindow.fxml" ) );

        Scene scene = new Scene( root ,400,200);
        Stage stage = new Stage(  );
        stage.setTitle( "FXML example" );
        stage.setScene( scene );
        stage.show();

    }
}
