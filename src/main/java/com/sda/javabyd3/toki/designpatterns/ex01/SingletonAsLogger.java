package com.sda.javabyd3.toki.designpatterns.ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SingletonAsLogger {

    private static SingletonAsLogger instance;
    private String FilePath = "C:\\Users\\Master\\Desktop\\Repo\\javabyd3all\\src\\Main\\java\\com\\sda\\javabyd3\\toki\\designpatterns\\ex01\\logger.txt";

    public static SingletonAsLogger getInstance() {
        if (instance == null) {
            synchronized (SingletonAsLogger.class) {
                if (instance == null) {
                    instance = new SingletonAsLogger();
                }
            }
        }
        return instance;
    }

    public void saveLog(String text) throws IOException {

        FileWriter fileWriter = new FileWriter(FilePath, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(text);
        printWriter.close();
    }


}
