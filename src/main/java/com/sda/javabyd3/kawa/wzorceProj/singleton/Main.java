package com.sda.javabyd3.kawa.wzorceProj.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton01.getInstance().saveLog("message");

        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());

        EnumSingleton.saveLog();
    }
}
