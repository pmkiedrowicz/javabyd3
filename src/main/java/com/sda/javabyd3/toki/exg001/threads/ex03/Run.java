package com.sda.javabyd3.toki.exg001.threads.ex03;

public class Run extends Thread {

    public void run(){
        for (int i = 1; i < 11; i++) {
            System.out.println("Here is thread named: "+Thread.currentThread().getName());
            System.out.println(" "+1);
            try{
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.getStackTrace();
            }
        }
    }
}
