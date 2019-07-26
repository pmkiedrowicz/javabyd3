package com.sda.javabyd3.kawa.exg001.Watki.ex03;

public class Main {
    public static void main(String[] args) {

        Thread my1Thread = new Thread(new JustAnotherMyThread());
        Thread my2Thread = new Thread(new JustAnotherMyThread());

        my1Thread.start();
        try {
            my1Thread.join();
        }catch (InterruptedException e){
            e.getStackTrace();
        }
        my2Thread.start();

    }
}
