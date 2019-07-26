package com.sda.javabyd3.lusi.introduction.threads.ex19;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Number> queue = new ConcurrentLinkedQueue<>();
        ThreadA threadA = new ThreadA(queue);
        threadA.setName("Randoming thread");
        ThreadB threadB = new ThreadB(queue);
        threadB.setName("Adding thread");
        threadA.start();
        threadB.start();
    }
}
