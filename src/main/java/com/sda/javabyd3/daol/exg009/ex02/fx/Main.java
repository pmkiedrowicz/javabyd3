package com.sda.javabyd3.daol.exg009.ex02.fx;


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
        Parent root = FXMLLoader.load(getClass().getResource("../../../../ui/nearestPrime.fxml"));
        Scene scene = new Scene(root, 400, 200);
        Stage stage = new Stage();
        stage.setTitle("FXML Example");
        stage.setScene(scene);
        stage.show();
    }
}
