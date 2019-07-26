package com.sda.javabyd3.mabr.zadania002;

import java.util.Arrays;
import java.util.List;

public class Zad6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        reverse(array);
    }

    public static void reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        int j = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[j];
            j--;
        }
        System.out.println("Odwrocona tablica: " + Arrays.toString(reverseArray));

        List<int[]> listOfElements = Arrays.asList(array);
    }
}
