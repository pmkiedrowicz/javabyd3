package com.sda.javabyd3.mabr.zadania002;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Zad9 {
    public int[] removeValues(int[] array, int[] arrayWhatRemove) {
        System.out.println("Tablica przed usunieciem: " + Arrays.toString(array));
        for (int i = 0; i < arrayWhatRemove.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    int elementToRemove = arrayWhatRemove[i];
                    array = IntStream.of(array).filter(item -> item != elementToRemove).toArray();
                    System.out.println("Usunieto  elelemnt -> Nowa tabela to: " + Arrays.toString(array));
                }
            }
        }
        return array;
    }
}
