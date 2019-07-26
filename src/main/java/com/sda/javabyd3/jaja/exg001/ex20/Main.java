package com.sda.javabyd3.jaja.exg001.ex20;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Thread1());
        thread.start();
        thread.join();

        Thread thread1 = new Thread(new Thread2());
        thread1.start();

    }
}

