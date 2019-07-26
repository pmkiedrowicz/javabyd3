package com.sda.javabyd3.jaja.exg002.ex03;

public class Zadanie3 {

    public boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (i == key) {
                System.out.println("Liczba znajduje się w tablicy. Wynik to: ");
                return true;
            }
        }
        System.out.println("Liczba nie znajduje sie w tablicy. Wynik to: ");
        return false;
    }
}
