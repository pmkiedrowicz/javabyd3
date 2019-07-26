package com.sda.javabyd3.urdu.designPatternExercises.ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SingletonLoger {

    private static SingletonLoger instance;
    private String FilePath = "C:\\Users\\Laures\\Desktop\\Text\\SingletonLog2.txt";

    public static SingletonLoger getInstance(){
        if(instance == null) {
            synchronized (SingletonLoger.class) {
                if (instance == null) {
                    instance = new SingletonLoger();
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
