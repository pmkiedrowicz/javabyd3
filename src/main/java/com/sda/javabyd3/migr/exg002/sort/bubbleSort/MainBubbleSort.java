package com.sda.javabyd3.migr.exg002.sort.bubbleSort;

public class MainBubbleSort {

    public static void main(String[] args) {

        int array[] = {1, 0, 56, 3, 0, 34, 65, 324, 9, 12, 66666};

        BubbleSort sor = new BubbleSort();

        sor.wypisz(array);
        sor.sortuj(array);
        System.out.println();
        sor.wypisz(array);


    }
}
