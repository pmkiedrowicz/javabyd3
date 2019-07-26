package com.sda.javabyd3.kade.DesignPattern.Singleton;

public class Singleton01 {

    private static Singleton01 instance = new Singleton01();

    public static Singleton01 getInstance(){
        return instance;
    }

    public void saveLog(String message){
        // Save into file

    }




}
