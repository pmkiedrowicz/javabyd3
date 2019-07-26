package com.sda.javabyd3.migr.designpattern.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton1.getInstance().saveLog("message");

        System.out.println("lazy");
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
        System.out.println("eager");
        System.out.println(Singleton1.getInstance());
        System.out.println(Singleton1.getInstance());

        EnumSingleton.saveLog();
    }
}
