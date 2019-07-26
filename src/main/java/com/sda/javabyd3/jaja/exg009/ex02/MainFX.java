package com.sda.javabyd3.jaja.exg009.ex02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainFX extends Application {
    public static void main(String[] args) {
        Application.launch(MainFX.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/UI_jaja/findNearestPrime.fxml"));

        Scene scene = new Scene(root,400,200);
        Stage stage = new Stage();
        stage.setTitle("Najbliższa liczba pierwsza");
        stage.setScene(scene);
        stage.show();
    }

}
