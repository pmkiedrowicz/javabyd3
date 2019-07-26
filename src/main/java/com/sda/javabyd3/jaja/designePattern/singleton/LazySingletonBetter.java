package com.sda.javabyd3.jaja.designePattern.singleton;

public class LazySingletonBetter {

    private static LazySingletonBetter instance;

    public static LazySingletonBetter getInstance(){
        if(instance == null) {
            synchronized (LazySingletonBetter.class) {
                if (instance == null) {
                    instance = new LazySingletonBetter();
                }
            }
        }
            return instance;
    }
}
