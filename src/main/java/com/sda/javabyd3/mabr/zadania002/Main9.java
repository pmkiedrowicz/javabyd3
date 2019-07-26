package com.sda.javabyd3.mabr.zadania002;

import java.util.Arrays;

public class Main9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] arrayToRemove = {3, 5};
        Zad9 zad9 = new Zad9();
        System.out.println("Tablica po usunieciu: " + Arrays.toString(zad9.removeValues(array, arrayToRemove)));
    }
}
