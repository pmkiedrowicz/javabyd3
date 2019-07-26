package com.sda.javabyd3.jaja.exg001.ex19;

public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new Thread1());
        thread.start();

        Thread thread1 = new Thread(new Thread2());
        thread1.start();

    }
}
