package com.sda.javabyd3.jaja.exg001.ex19;

public class Thread1 implements Runnable{
    @Override
    public void run() {

        try {for (int i = 1; i<=10; i++){
            System.out.println("Thread 1: " + i);
            Thread.sleep(1000);
        }

        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
