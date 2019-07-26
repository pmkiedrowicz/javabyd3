//Zmodyfikuj aplikację tak, aby wątek 2 rozpoczął przetwarzanie po zakończeniu
//wyświetlania liczb przez wątek 1. Skorzystaj z operacji join().

package com.sda.javabyd3.wowa.exg001.Watki.ex03;

public class Watki_3Run {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Watki_3());
        Thread thread2 = new Thread(new Watki_3());

        try {
            thread1.start();
            thread1.join();
            thread2.start();
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}
