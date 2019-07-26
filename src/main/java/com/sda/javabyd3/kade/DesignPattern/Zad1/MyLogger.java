package com.sda.javabyd3.kade.DesignPattern.Zad1;

public class MyLogger {

    private static MyLogger instance = new MyLogger();

    public static MyLogger getInstance() {
        return instance;
    }

    public synchronized void saveLog(String text) {

    }
}
