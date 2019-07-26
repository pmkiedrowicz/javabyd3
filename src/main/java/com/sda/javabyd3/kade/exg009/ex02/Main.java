package com.sda.javabyd3.kade.exg009.ex02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../../../../../../ui_kade/exg009ex02.fxml"));
        Scene scene = new Scene(root, 600, 300);
        Stage stage = new Stage();
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {

        launch(Main.class, args);
    }


}
