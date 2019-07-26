package com.sda.javabyd3.lusi.introduction.threads.ex15;

import java.util.Random;

public class MyThread extends Thread {
    private static final int timeout = 1000;
    private Random random = new Random(System.currentTimeMillis());
    private int counter = 0;

    public MyThread() {
        this.setName("My Thread");
    }

    @Override
    public void run() {
        while (counter < 5) {
            try {
                while (counter < 5) {
                    System.out.println(random.nextInt(91) + 10);
                    counter++;
                    Thread.sleep(timeout);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}