package com.sda.javabyd3.toki.exg001.threads.ex02;

public class Main implements Runnable{
    public static void main(String[] args) {
        Main main = new Main();
        Thread thread = new Thread(main);
        Thread thread2=new Thread(main);
        thread.start();
        thread2.start();
    }
    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) {
        System.out.println(i);
        }
    }
}