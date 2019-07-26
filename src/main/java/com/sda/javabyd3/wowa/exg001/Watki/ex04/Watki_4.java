//Utwórz aplikację wielowątkową. Skorzystaj ze stałej (5 sztuk) puli wątków. Niech
//każdy wątek wyświetla kolejno liczby z przedziału 1-10. Każdy z wątków powinien
//dodatkowo wyświetlać informację o rozpoczęciu przetwarzania i jego zakończeniu.

package com.sda.javabyd3.wowa.exg001.Watki.ex04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Watki_4 {
    public static void main(String[] args) {
        ExecutorService exservice = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            exservice.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("Thread: " + Thread.currentThread() + " starts.");
                        for (int i = 1; i <= 10; i++) {
                            Thread.sleep(400);
                            System.out.print(i + " ");
                        }
                        Thread.sleep(200);
                        System.out.print("\nThread: " + Thread.currentThread() + " ends.");
                    } catch (InterruptedException e) {
                        e.getMessage();
                    }
                }
            });
        }
        exservice.shutdown();
    }
}
