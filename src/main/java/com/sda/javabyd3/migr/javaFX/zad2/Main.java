package com.sda.javabyd3.migr.javaFX.zad2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../../../../../../ui/mainWindowZad2.fxml"));

        Scene scene = new Scene(root,600,400);
        Stage stage = new Stage();
        stage.setTitle("FXML example2");
        stage.setScene(scene );
        stage.show();

    }
}
