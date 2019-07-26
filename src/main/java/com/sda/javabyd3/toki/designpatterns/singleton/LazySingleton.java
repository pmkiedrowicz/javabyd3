package com.sda.javabyd3.toki.designpatterns.singleton;

public class LazySingleton {
    private static LazySingleton instance;

    public static LazySingleton getInstance() {
        instance = new LazySingleton();
        return instance;
    }
}
