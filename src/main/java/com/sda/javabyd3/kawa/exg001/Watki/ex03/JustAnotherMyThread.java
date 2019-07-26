package com.sda.javabyd3.kawa.exg001.Watki.ex03;

public class JustAnotherMyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i<11;i++){
            System.out.println(Thread.currentThread() + " " + i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.getStackTrace();
            }
        }
    }
}
