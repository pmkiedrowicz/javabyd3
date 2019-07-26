package com.sda.javabyd3.kawa.exgWzorceProjektowe.ex01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyLogger {

    private static MyLogger instance;

    public static MyLogger getInstance() {
        if (instance == null) {
            synchronized (MyLogger.class) {
                if (instance == null) {
                    instance = new MyLogger();
                }
            }
        }
        return instance;
    }

    public void saveLog(String message) throws IOException {
        File file = new File("C:\\Users\\Lenovo\\Desktop\\logowane.txt");
        FileWriter fileWriter = new FileWriter("C:\\Users\\Lenovo\\Desktop\\logowane.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(message);
        bufferedWriter.close();
        System.out.println("Zapisano");


    }
}
