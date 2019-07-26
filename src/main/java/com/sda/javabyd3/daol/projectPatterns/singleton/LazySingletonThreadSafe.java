package com.sda.javabyd3.daol.projectPatterns.singleton;

public class LazySingletonThreadSafe {
    private static LazySingletonThreadSafe instance;

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
