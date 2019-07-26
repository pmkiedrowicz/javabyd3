package com.sda.javabyd3.migr.designpattern.singleton;

public class LazySingletonThreadSafe {
    public static LazySingletonThreadSafe instance;

    public static LazySingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (LazySingletonThreadSafe.class) {
                if (instance == null) {

                    instance = new LazySingletonThreadSafe();
                }
            }
        }
        return instance;

    }
}
