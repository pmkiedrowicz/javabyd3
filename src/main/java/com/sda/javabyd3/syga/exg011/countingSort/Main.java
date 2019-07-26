package com.sda.javabyd3.syga.exg011.countingSort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CountingSort countingSort = new CountingSort();
        Random random = new Random();

        int theArray[] = new int[10];
        System.out.println("Tablica przed sorotwaniem");
        for (int i = 0; i < 10; i++) {
            theArray[i] = random.nextInt(20);
            System.out.print(theArray[i] + ", ");
        }
        System.out.println("\nTablica po sorotwaniu");
        countingSort.sort(theArray);
    }
}
