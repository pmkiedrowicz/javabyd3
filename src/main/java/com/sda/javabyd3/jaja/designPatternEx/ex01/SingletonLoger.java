package com.sda.javabyd3.jaja.designPatternEx.ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SingletonLoger {

    private static SingletonLoger instance;
    private String Filepath = "C:\\Users\\jagod\\Desktop\\zadania Java\\Wzorce projektowe\\Singleton.txt";

    public static SingletonLoger getInstance(){
        if (instance ==null){
            synchronized (SingletonLoger.class){
                if (instance==null){
                    instance = new SingletonLoger();
                }
            }
        } return instance;
    }

    public void printToFile(String text) throws IOException{
        FileWriter fileWriter = new FileWriter(Filepath,true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(text);
        printWriter.close();

    }
}
