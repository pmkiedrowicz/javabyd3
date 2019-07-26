package com.sda.javabyd3.toki.exg0011.ex01;

public class BubbleSort {
    public BubbleSort() {
    }

    public int[] bubbleSort(int[] tab) {

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        System.out.println("\n");

        int temp;
        int check = 1;
        while (check > 0) {
            check = 0;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] < tab[i + 1]) {
                    temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                    check++;
                }
            }
        }
    return tab;
    }
}