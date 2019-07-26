package com.sda.javabyd3.toki.exg001.threads.ex04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Run thread1 = new Run();
        thread1.setName("t1");
        executorService.execute(thread1);
        Run thread2=new Run();
        thread2.setName("t2");
        executorService.execute(thread2);
        Run thread3=new Run();
        thread3.setName("t3");
        executorService.execute(thread3);
        Run thread4=new Run();
        thread4.setName("t4");
        executorService.execute(thread4);
        Run thread5=new Run();
        thread5.setName("t5");
        executorService.execute(thread5);

        executorService.shutdown();
    }
}
