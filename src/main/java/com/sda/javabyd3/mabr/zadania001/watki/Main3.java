package com.sda.javabyd3.mabr.zadania001.watki;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Rozpoczynam watek pierwszy ");
        Thread thread1 = new Thread(new Zad3(), "Watek 1");
        Thread thread2 = new Thread(new Zad3(), "Watek 2");
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}
