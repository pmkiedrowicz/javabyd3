package com.sda.javabyd3.lusi.introduction.threads.ex19;

import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadA extends Thread {
    private static final Random random = new Random(System.currentTimeMillis());
    private static final int timeout = 1000;
    private ConcurrentLinkedQueue<Number> queue;

    public ThreadA(ConcurrentLinkedQueue<Number> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Number number = new Number(random.nextInt(1000), random.nextInt(1000));
                System.out.println(String.format("Wylosowano liczby %d i %d", number.getX(), number.getY()));
                queue.add(number);
                Thread.sleep(timeout);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
