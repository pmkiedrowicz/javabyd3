package com.sda.javabyd3.toki.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton01.getInstance().saveLog("braaaaaap");


        

        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
    }
}
