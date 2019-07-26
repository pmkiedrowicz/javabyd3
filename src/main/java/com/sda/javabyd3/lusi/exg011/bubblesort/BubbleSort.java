package com.sda.javabyd3.lusi.exg011.bubblesort;

import java.util.Arrays;

/**
 * Class sort provided array using bubble sort mechanism
 */
public class BubbleSort {

    /**
     * Sorts array provided by user.
     *
     * @param source {@link int[]} array provided by user
     * @return Sorted array
     */
    public int[] sort(int[] source) {
        int[] result = Arrays.copyOf(source, source.length);
        boolean change = true;
        while (change) {
            change = false;
            for (int i = 0; i < (result.length - 1); i++) {
                if (result[i] > result[i + 1]) {
                    switchPlaces(result, i, i + 1);
                    change = true;
                }
            }
        }
        return result;
    }

    private void switchPlaces(int[] array, int source, int destination) {
        int temp = array[source];
        array[source] = array[destination];
        array[destination] = temp;
    }
}
