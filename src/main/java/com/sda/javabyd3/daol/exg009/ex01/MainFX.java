package com.sda.javabyd3.daol.exg009.ex01;

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
        Parent root = FXMLLoader.load(getClass().getResource("../../../ui/numberConverter.fxml"));
        Scene scene = new Scene(root, 400,200);
          Stage stage = new Stage();
          stage.setTitle("FXML Example");
          stage.setScene(scene);
          stage.show();
    }
}
