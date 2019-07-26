package com.sda.javabyd3.kawa.exg001.Watki.ex02;

public class My1Thread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }
}
