//Przygotuj aplikację składającą się z 2 wątków Utwórz każdy wątek samodzielnie.
//Niech każdy wątek wyświetla liczby całkowite od 1-10.

package com.sda.javabyd3.wowa.exg001.Watki.ex02;

public class Watki_2Run {
    public static void main(String[] args) {

//      (new Thread(new Watki_1())).start(); - to samo co nizej
        Thread thread1 = new Thread(new Watki_2());
        Thread thread2 = new Thread(new Watki_2());
        thread1.start();
        thread2.start();
    }
}
