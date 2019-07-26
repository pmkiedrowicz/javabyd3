package com.sda.javabyd3.toki.exg001.threads.ex01;

public class Main extends Thread {
    public void run() {

        System.out.println("Hello world");
    }

    public static void main(String[] args) {

        (new Main()).run();
    }
}