package com.sda.javabyd3.lusi.exg011.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class sort provided array using counting sort mechanism
 */
public class CountingSort {

    /**
     * Sorts array provided by user.
     *
     * @param source {@link int[]} array provided by user
     * @return Sorted array
     */
    public int[] sort(int[] source) {
        List<Integer> result = new ArrayList<>();
        int[] arrayOfNumbers = new int[Arrays.stream(source).max().getAsInt() + 1];
        for (int i = 0; i < source.length; i++) {
            arrayOfNumbers[source[i]]++;
        }
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] > 0) {
                for (int j = 0; j < arrayOfNumbers[i]; j++) {
                    result.add(i);
                }
            }
        }
        return result.stream().mapToInt(e -> e).toArray();
    }
}
