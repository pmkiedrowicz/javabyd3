package com.sda.javabyd3.kawa.javaFxKawaTest.test3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainForExg009Ex02 extends Application{
    public static void main(String[] args) {
        Application.launch(MainForExg009Ex02.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../../../../../../ui/mainWindowForKawaExg009Ex02.fxml"));

        Scene scene = new Scene(root, 600,400);
        Stage stage = new Stage();
        stage.setTitle("FXML Example2");
        stage.setScene(scene);
        stage.show();
    }
}
