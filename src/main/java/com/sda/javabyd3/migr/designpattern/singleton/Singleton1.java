package com.sda.javabyd3.migr.designpattern.singleton;

public class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }

    public void saveLog(String message){
        //save info to file
    }
}
