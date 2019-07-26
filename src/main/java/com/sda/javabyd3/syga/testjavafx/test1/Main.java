package com.sda.javabyd3.syga.testjavafx.test1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label1 = new Label("Hello World");
        Label label2 = new Label("Hello World");
        Label label3 = new Label("Hello World");
        Label label4 = new Label("Hello World");
        Label label5 = new Label("Hello World");
        Label label6 = new Label("Hello World");
        Label label7 = new Label("Hello World");
        Label label8 = new Label("Hello World");
        Label label9 = new Label("Hello World");

        VBox vbox1 = new VBox();
        vbox1.getChildren().addAll(label1, label2, label3);


        VBox vbox2 = new VBox();
        vbox2.getChildren().addAll(label4, label5, label6);

        VBox vbox3 = new VBox();
        vbox3.getChildren().addAll(label9, label8, label7);

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.setSpacing(50);
        box.getChildren().add(vbox1);
        box.getChildren().add(vbox2);
        box.getChildren().add(vbox3);

        Scene scene = new Scene(box);
        Stage stage = new Stage();
        stage.setWidth(400);
        stage.setHeight(200);
        stage.setScene(scene);
        stage.show();
    }
}
