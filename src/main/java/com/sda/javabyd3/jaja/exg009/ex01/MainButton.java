package com.sda.javabyd3.jaja.exg009.ex01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainButton extends Application {
    public static void main(String[] args) {
        Application.launch(MainButton.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/UI_jaja/numberConverter.fxml"));

        Scene scene = new Scene(root,700,400);
        Stage stage = new Stage();
        stage.setTitle("Liczba w postaci słownej");
        stage.setScene(scene);
        stage.show();
    }
}
