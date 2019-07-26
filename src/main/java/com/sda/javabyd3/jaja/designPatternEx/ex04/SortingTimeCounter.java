package com.sda.javabyd3.jaja.designPatternEx.ex04;

public class SortingTimeCounter {

    public long calculate(int[]array, SortingStrategy sortingStrategy) {
        long startSort = System.currentTimeMillis();
        System.out.println("Start: " + startSort);
        sortingStrategy.calculate(array,0,array.length-1);
        long endSort = System.currentTimeMillis();
        System.out.println("End: " + endSort);
        long timeSort = endSort - startSort;

        return timeSort;
    }
}
