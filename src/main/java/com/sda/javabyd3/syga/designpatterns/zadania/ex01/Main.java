package com.sda.javabyd3.syga.designpatterns.zadania.ex01;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String logThis = "Hello World!";

        Singleton singleton = Singleton.getInstance();
        try {
            singleton.saveLog(logThis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
