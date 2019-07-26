package com.sda.javabyd3.jaja.exg001.ex20;

public class Thread2 implements Runnable{
    @Override
    public void run() {

        try { for (int i = 1; i <=10; i++){
            System.out.println("Thread 2: " + i);
            Thread.sleep(1000);
        }

        }catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

