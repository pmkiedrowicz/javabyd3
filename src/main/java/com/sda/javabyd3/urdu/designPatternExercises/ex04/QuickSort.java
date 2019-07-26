package com.sda.javabyd3.urdu.designPatternExercises.ex04;

public class QuickSort implements SortingStrategy{

    public int[] sort(int[] array, int left, int right) {

        int l = left;
        int r = right;
        int temp;
        int pivot = array[(left + right) / 2];

        do {
            while (array[l] < pivot) l++;
            while (array[r] > pivot) r--;
            if (l <= r) {
                temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                l++;
                r--;
            }
        } while (l <= r);

        if (left < r) sort(array, left, r);
        if (l < right)sort(array, l, right);

        return array;
    }


}
