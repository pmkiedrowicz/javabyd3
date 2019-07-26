package com.sda.javabyd3.lusi.introduction.threads.ex16;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.setName("My Thread");
        thread.start();
    }
}
