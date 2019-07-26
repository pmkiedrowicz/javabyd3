package com.sda.javabyd3.mizi.JavaFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



/**
 * Created by Michal Ziolecki.
 */
public class test extends Application{

    public static void main(String[] args) {
        launch( args );
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label1 = new Label( "Hello world" );
        Label label2 = new Label( "Hello world2" );
        Label label3 = new Label( "Hello world3" );
        Label label4 = new Label( "Hello world" );
        Label label5 = new Label( "Hello world2" );
        Label label6 = new Label( "Hello world3" );
        Label label7 = new Label( "Hello world" );
        Label label8 = new Label( "Hello world2" );
        Label label9 = new Label( "Hello world3" );

        VBox vBox1 = new VBox(  );
        vBox1.getChildren().addAll( label1, label2, label3 );
        VBox vBox2 = new VBox(  );
        vBox2.getChildren().addAll( label4, label5, label6 );
        VBox vBox3 = new VBox(  );
        vBox3.getChildren().addAll( label7, label8, label9 );
        HBox hbox = new HBox(  );

        hbox.getChildren().addAll( vBox1, vBox2, vBox3);
        hbox.setSpacing( 50 );
        hbox.setAlignment( Pos.BASELINE_CENTER );


        Scene scene = new Scene( hbox );
        Stage stage = new Stage ();
        stage.setWidth( 500 );
        stage.setHeight( 500 );
        stage.setScene(scene);
        stage.show();
    }
}
