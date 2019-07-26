package com.sda.javabyd3.mabr.zadania001.watki;

public class Zad3 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Tutaj watek o nazwie: " + Thread.currentThread().getName());
            System.out.println(" " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }
}
