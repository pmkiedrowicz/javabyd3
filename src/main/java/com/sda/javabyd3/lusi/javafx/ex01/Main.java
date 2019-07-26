package com.sda.javabyd3.lusi.javafx.ex01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/ui_lusi/window.fxml"));
        Scene scene = new Scene(root, 400, 200);
        Stage stage = new Stage();
        stage.setTitle("FXML Example");
        stage.setScene(scene);
        stage.show();
    }
}
