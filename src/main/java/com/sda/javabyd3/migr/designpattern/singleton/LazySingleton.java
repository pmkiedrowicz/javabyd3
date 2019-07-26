package com.sda.javabyd3.migr.designpattern.singleton;

public class LazySingleton {
    public static LazySingleton instance;

    public synchronized static LazySingleton getInstance() {
        if (instance == null){
        instance = new LazySingleton();
        }
        return instance;
    }
}
