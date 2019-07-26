package com.sda.javabyd3.syga.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton01.getInstance().saveLog("message");

        System.out.println("Eager Singleton");
        System.out.println(Singleton01.getInstance());
        System.out.println(Singleton01.getInstance());

        System.out.println("Lazy Singleton");
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());

        System.out.println("Enum Singleton");
        EnumSingleton.saveLog();
    }
}
