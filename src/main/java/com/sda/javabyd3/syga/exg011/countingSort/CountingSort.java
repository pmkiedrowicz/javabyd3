package com.sda.javabyd3.syga.exg011.countingSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort {
    public int[] sort(int[] theArray) {
        List<Integer> sorted = new ArrayList<>();
        int max = theArray[0];

        for (int i = 0; i < theArray.length; i++) {
            if (theArray[i] > max) {
                max = theArray[i] + 1;
            }
        }
        int[] count = new int[max];
        // int[] count = new int[Arrays.stream(theArray).max().getAsInt() +1];

        for (int i = 0; i < theArray.length; i++) {
            count[theArray[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                for (int j = 0; j < count[i]; j++) {
                    sorted.add(i);
                }
            }
        }

        System.out.println(sorted);
        return sorted.stream().mapToInt(e -> e).toArray();

    }
}
