package com.sda.javabyd3.migr.designpattern.ex01.ex01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyLogger {

    private static MyLogger instance;

    static {
        try {
            instance = new MyLogger();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public MyLogger() throws IOException {
    }

    public static MyLogger getInstance() throws IOException {
        if (instance == null) {
            synchronized (MyLogger.class) {
                if (instance == null) {
                    instance = new MyLogger();
                }
            }

        }
        return instance;
    }


    public void saveLog(String msg) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:/srogi", true));
        try {
            bufferedWriter.write(msg);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
