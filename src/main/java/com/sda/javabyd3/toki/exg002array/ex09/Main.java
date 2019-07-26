package com.sda.javabyd3.toki.exg002array.ex09;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 19, 100, 999};
        int[] array2 = {19, 100};

        RemoveValues removeValues = new RemoveValues();

        System.out.println(Arrays.toString(removeValues.removeValues(array1, array2)));
    }
}
