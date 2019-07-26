package com.sda.javabyd3.mabr.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main2 extends Application {
    public static void main(String[] args) {
        Application.launch(Main2.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../ui/mainWindow.fxml"));
        Scene scene = new Scene(root, 400, 200);
        Stage stage = new Stage();
        stage.getTitle();
        stage.setScene(scene);
        stage.show();

    }
}
