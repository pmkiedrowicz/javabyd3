package com.sda.javabyd3.daol.projectPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton01.getInstance().saveLog("message");

        System.out.println("Eager singleton");
        System.out.println(Singleton01.getInstance());
        System.out.println(Singleton01.getInstance());

        System.out.println("Lazy singleton");
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());

        // ciekawostka - nie używać Enuma jako Singleton
        EnumSingleton.saveLog();
    }
}
