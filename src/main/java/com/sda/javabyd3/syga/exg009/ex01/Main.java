package com.sda.javabyd3.syga.exg009.ex01;

import com.sda.javabyd3.lusi.introduction.TextColor;
import com.sda.javabyd3.lusi.introduction.Utils;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

//
//    public static void Main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Wprowadź liczbę: ");
//        int number = scanner.nextInt();
//        String numberAsText = new NumberConverter().convertToString(number);
//        System.out.println();
//        Utils.displayTextOnConsole(number + " = " + numberAsText, TextColor.ANSI_GREEN);
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę: ");
        int number = scanner.nextInt();
        String numberAsText = new NumberConverter().convertToString(number);
        System.out.println();
        Utils.displayTextOnConsole(number + " = " + numberAsText, TextColor.ANSI_GREEN);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../../../../../../ui/mainEx01_009.fxml"));
        Scene scene = new Scene(root,700,200);
        Stage stage = new Stage();
        stage.setTitle("Liczba słownie");
        stage.setScene(scene);
        stage.show();
    }
}
