package com.sda.javabyd3.toki.exg001.threads.ex04;

public class Run extends Thread{

    public void run(){
        System.out.println("New thread no: "+Thread.currentThread().getName());
        for (int i = 1; i < 11; i++) {
            System.out.println(" "+i);
        }
        System.out.println("Thread no: "+Thread.currentThread().getName()+" exercise has end.");
    }

}
