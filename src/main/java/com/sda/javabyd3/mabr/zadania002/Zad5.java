package com.sda.javabyd3.mabr.zadania002;

import java.util.Arrays;

public class Zad5 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Kopia tablicy: " + Arrays.toString(copyArray(array)));
    }

    public static int[] copyArray(int[] array) {
        int[] copyOfArray = array;
        return copyOfArray;
    }
}
