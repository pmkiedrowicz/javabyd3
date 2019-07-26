package com.sda.javabyd3.mabr.zadania001.watki;

public class Zad1 extends Thread {
    public static void main(String[] args) {
        new Thread(new Zad1()).start();
    }

    @Override
    public void run() {
        System.out.println("Hello World");
    }
}
