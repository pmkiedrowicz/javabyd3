package com.sda.javabyd3.mabr.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label1 = new Label(" Hello World!");
        Label label2 = new Label(" Hello World!");
        Label label3 = new Label(" Hello World!");
        Label label4 = new Label(" Hello World!");
        Label label5 = new Label(" Hello World!");
        Label label6 = new Label(" Hello World!");
        Label label7 = new Label(" Hello World!");
        Label label8 = new Label(" Hello World!");
        Label label9 = new Label(" Hello World!");

        VBox vBox1 = new VBox();
        vBox1.getChildren().add(label1);
        vBox1.getChildren().add(label2);
        vBox1.getChildren().add(label3);

        VBox vBox2 = new VBox();
        vBox2.getChildren().add(label4);
        vBox2.getChildren().add(label5);
        vBox2.getChildren().add(label6);

        VBox vBox3 = new VBox();
        vBox3.getChildren().add(label7);
        vBox3.getChildren().add(label8);
        vBox3.getChildren().add(label9);

        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);

        hbox.getChildren().add(vBox1);
        hbox.getChildren().add(vBox2);
        hbox.getChildren().add(vBox3);

        Scene scene = new Scene(hbox);

        Stage stage = new Stage();
        stage.setWidth(400);
        stage.setHeight(200);
        stage.setScene(scene);
        stage.show();

    }
}
