//Przygotuj aplikację składającą się z 2 wątków Utwórz każdy wątek samodzielnie.
//Niech każdy wątek wyświetla liczby całkowite od 1-10.

package com.sda.javabyd3.wowa.exg001.Watki.ex02;

public class Watki_2 implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 1; i < 11; i++) {
                System.out.println("Thread : " + Thread.currentThread() + " - " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}
