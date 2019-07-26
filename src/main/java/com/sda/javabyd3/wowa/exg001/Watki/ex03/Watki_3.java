//Zmodyfikuj aplikację tak, aby wątek 2 rozpoczął przetwarzanie po zakończeniu
//wyświetlania liczb przez wątek 1. Skorzystaj z operacji join().

package com.sda.javabyd3.wowa.exg001.Watki.ex03;

public class Watki_3 implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 1; i < 11; i++) {
                System.out.println("Thread : " + Thread.currentThread() + " - " + i);
                Thread.sleep(400);
            }
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}
