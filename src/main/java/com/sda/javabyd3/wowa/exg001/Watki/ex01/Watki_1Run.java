//Przygotuj aplikację uruchamiającą jeden wątek. Niech wątek wyświetla informację
//hello world.

package com.sda.javabyd3.wowa.exg001.Watki.ex01;

public class Watki_1Run {
    public static void main(String[] args) {

//      (new Thread(new Watki_1())).start(); - to samo co nizej
        Thread thread1 = new Thread(new Watki_1());
        thread1.start();
    }
}
