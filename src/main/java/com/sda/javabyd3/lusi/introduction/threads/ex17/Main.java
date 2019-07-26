package com.sda.javabyd3.lusi.introduction.threads.ex17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        IntStream.rangeClosed(1, 5).forEach(i -> threadPool.execute(new MyOperation()));
        threadPool.shutdown();
    }
}
