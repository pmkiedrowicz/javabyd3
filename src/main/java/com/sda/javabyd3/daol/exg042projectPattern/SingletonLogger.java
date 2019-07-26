package com.sda.javabyd3.daol.exg042projectPattern;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SingletonLogger {
    private static SingletonLogger instance;

    public static SingletonLogger getInstance() {
        if (instance == null) {
            synchronized (SingletonLogger.class) {
                if (instance == null) {
                    instance = new SingletonLogger();
                }
            }
        }
        return instance;
    }

    public void logger(String text) {
        try {
            try (BufferedWriter writer = new BufferedWriter(
                    new FileWriter("C:\\Users\\Dom\\Desktop\\RepozytoriumGIT\\GitWspolny\\javabyd3all\\src\\Main\\java\\com\\sda\\javabyd3\\daol\\exg042projectPattern\\wzorce_zapis.txt", true))) {
                writer.write(text);
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
