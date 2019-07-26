//Przygotuj aplikację uruchamiającą jeden wątek. Niech wątek wyświetla informację
//hello world.

package com.sda.javabyd3.wowa.exg001.Watki.ex01;

public class Watki_1 implements Runnable {

    @Override
    public void run() {
        System.out.println("hello world");
    }
}
