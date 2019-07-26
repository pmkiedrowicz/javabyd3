package com.sda.javabyd3.mabr.zadania002;

import java.util.Arrays;

public class Zad4 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4, 5, 6};

        System.out.println("Porownanie dwoch tabel: " + equals(array1, array2));
    }

    public static boolean equals(int[] array1, int[] array2) {
        boolean test = false;
        test = Arrays.equals(array1, array2);

        return test;
    }
}
