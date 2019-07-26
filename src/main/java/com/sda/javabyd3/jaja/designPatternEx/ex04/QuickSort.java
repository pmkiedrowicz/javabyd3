package com.sda.javabyd3.jaja.designPatternEx.ex04;

import java.util.Arrays;

public class QuickSort implements SortingStrategy{

    @Override
    public int[] calculate(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int temp;
        int pivot = array[(left + right) / 2];

        do {
//            System.out.print(Arrays.toString(array));
//            System.out.println("p=" + pivot);
            while (array[i] < pivot) i++;
            while (array[j] > pivot) j--;
            if (i <= j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

        } while (i <= j);

        if (left < j) calculate(array, left, j);
        if (i < right) calculate(array, i, right);

        return array;
    }
}


