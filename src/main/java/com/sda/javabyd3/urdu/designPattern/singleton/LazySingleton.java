package com.sda.javabyd3.urdu.designPattern.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    public synchronized static LazySingleton getInstance(){
        if(instance == null) {
            instance = new LazySingleton();
        }
            return instance;

    }
}
