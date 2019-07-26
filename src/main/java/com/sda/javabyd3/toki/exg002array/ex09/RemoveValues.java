package com.sda.javabyd3.toki.exg002array.ex09;

import java.util.stream.IntStream;

public class RemoveValues {

    private int temp;

    public int[] removeValues(int[] array1, int[] array2) {

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[j] == array1[i]) {
                    temp = array2[i];
                    array1 = IntStream.of(array1).filter(el -> el != temp).toArray();
                }
            }
        }
        return array1;
    }
}
