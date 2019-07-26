package com.sda.javabyd3.jaja.exg011.ex03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CountingSort countingSort = new CountingSort();
        countingSort.maxValue = 10;
        int[] notSort = {9,2,4,6,10,7,9};
        System.out.println(Arrays.toString(countingSort.countingSort(notSort)));


    }
}
