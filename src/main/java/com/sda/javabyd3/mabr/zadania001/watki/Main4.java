package com.sda.javabyd3.mabr.zadania001.watki;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main4 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Zad4 thread1 = new Zad4();
        thread1.setName(" w1");
        Zad4 thread2 = new Zad4();
        thread1.setName(" w2");
        Zad4 thread3 = new Zad4();
        thread1.setName(" w3");
        Zad4 thread4 = new Zad4();
        thread1.setName(" w4");
        Zad4 thread5 = new Zad4();
        thread1.setName(" w5");
        System.out.println("ROZPOCZYNAM WATKI");
        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        executorService.execute(thread4);
        executorService.execute(thread5);
        System.out.println("\n KONIEC MAIN");
        executorService.shutdown();
    }
}
