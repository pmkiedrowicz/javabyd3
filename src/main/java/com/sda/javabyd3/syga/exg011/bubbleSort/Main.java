package com.sda.javabyd3.syga.exg011.bubbleSort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        Random random = new Random();

        int[] tabOfNumber = new int[10];

        System.out.println("Tablica przed sortowaniem.");
        for (int i = 0; i < 10; i++) {
            tabOfNumber[i] = random.nextInt(100);
            System.out.println(tabOfNumber[i]);
        }
        System.out.println("\nTablica po sortowaniu");
        bubbleSort.bubblesort(tabOfNumber);
    }
}
