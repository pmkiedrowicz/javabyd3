package com.sda.javabyd3.toki.designpatterns.ex01;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String logThis = "Ala ma kota";

        SingletonAsLogger singletonAsLogger = SingletonAsLogger.getInstance();
        try {
            singletonAsLogger.saveLog(logThis);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        singletonAsLogger.getInstance().saveLog("Ala ma kota");

    }
}
