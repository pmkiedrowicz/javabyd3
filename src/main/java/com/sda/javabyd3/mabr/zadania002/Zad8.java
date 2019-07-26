package com.sda.javabyd3.mabr.zadania002;

public class Zad8 {
    public boolean checkArray(int[] array) {
        boolean test = false;

        if (array.length >= 3) {
            System.out.println("Dlugosc tablicy ok - testujemy kombinacje");
            int n, nPlus1, nMinus1;
            for (int i = 1; i <= array.length - 2; i++) {
                n = i;
                nPlus1 = i + 1;
                nMinus1 = i - 1;
                if (array[n] == array[nPlus1] && array[n] == array[nMinus1]) test = true;
            }
        } else System.out.println("Tablica jest za krotka do tego testu");
        return test;
    }
}
