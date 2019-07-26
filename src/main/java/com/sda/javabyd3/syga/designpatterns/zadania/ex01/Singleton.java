package com.sda.javabyd3.syga.designpatterns.zadania.ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Singleton {
 private static Singleton instance;
 private String FilePath = "C:\\Users\\sylwe\\Desktop\\Repozytorium\\Text\\Singleton.txt";

 public static Singleton getInstance() {
     if (instance == null) {
         synchronized (Singleton.class) {
             if (instance == null) {
                 instance = new Singleton();
             }
         }
     }
     return instance;
 }

 public void saveLog(String text) throws IOException{
     FileWriter fileWriter = new FileWriter(FilePath, true);
     PrintWriter printWriter = new PrintWriter(fileWriter);
     printWriter.println(text);
     printWriter.close();
 }
}
