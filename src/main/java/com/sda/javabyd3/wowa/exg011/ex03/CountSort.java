//Przygotuj program sortujący tablicę metodą przez zliczanie
//Dane wejściowe: Elementy tablicy nieposortowanej
//Dane wyjściowe: Tablica posortowana

package com.sda.javabyd3.wowa.exg011.ex03;

public class CountSort {
    public int[] countSort(int[] arr) {
        int sortedArr[] = arr.clone();

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        // init array of frequencies
        int[] counts = new int[max - min + 1];

        // init the frequencies
        for (int i = 0; i < arr.length; i++) {
            counts[arr[i] - min]++;
        }

        // recalculate the array - create the array of occurences
        counts[0]--;
        for (int i = 1; i < counts.length; i++) {
            counts[i] = counts[i] + counts[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            sortedArr[counts[arr[i] - min]--] = arr[i];
        }
        return sortedArr;
    }
}
