package com.sda.javabyd3.toki.exg001.threads.ex03;

public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Run(), "Thread 1");
        Thread thread2 = new Thread(new Run(), "Thread 2");

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();

    }
}