package com.sda.javabyd3.lusi.introduction.threads.ex19;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadB extends Thread {
    private static final int timeout = 1000;
    private ConcurrentLinkedQueue<Number> queue;

    public ThreadB(ConcurrentLinkedQueue<Number> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Number number = queue.poll();
                if (number != null) {
                    System.out.println(String.format("Suma liczb %d i %d wynosi %d", number.getX(), number.getY(), number.getX() + number.getY()));
                } else {
                    Thread.sleep(timeout);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
