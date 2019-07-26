package com.sda.javabyd3.toki.javaFx.test;

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
        Label label1 = new Label("Hello world 1 ");
        Label label2 = new Label("Hello world 2 ");
        Label label3 = new Label("Hello world 3 ");
        Label label4 = new Label("Hello world 4 ");
        Label label5 = new Label("Hello world 5 ");
        Label label6 = new Label("Hello world 6 ");
        Label label7 = new Label("Hello world 7 ");
        Label label8 = new Label("Hello world 8 ");
        Label label9 = new Label("Hello world 9 ");

        VBox vBox1 = new VBox();
        vBox1.getChildren().addAll(label1,label2,label3);

        VBox vBox2 = new VBox();
        vBox2.getChildren().addAll(label4,label5,label6);

        VBox vBox3 = new VBox();
        vBox3.getChildren().addAll(label7,label8,label9);

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(vBox1,vBox2,vBox3);
        hBox.setSpacing(100);

        Scene scene = new Scene(hBox);
        Stage stage = new Stage();
        stage.setWidth(800);
        stage.setHeight(400);
        stage.setScene(scene);
        stage.show();

    }
}
