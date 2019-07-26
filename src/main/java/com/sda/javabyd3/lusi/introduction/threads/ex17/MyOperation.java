package com.sda.javabyd3.lusi.introduction.threads.ex17;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class MyOperation implements Runnable {

    private static final Random random = new Random(System.currentTimeMillis());
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH'h'mm'm'ss's'SS'ms'");

    @Override
    public void run() {
        try {
            Thread.sleep(random.nextInt(4001) + 1000);
            System.out.println(LocalTime.now().format(timeFormatter));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
