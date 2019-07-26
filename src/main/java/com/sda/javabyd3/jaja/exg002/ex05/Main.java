package com.sda.javabyd3.jaja.exg002.ex05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Zadanie5 zadanie5 = new Zadanie5();
        int[] numbers = {1, 2, 3, 4, 5, 6, 8, 9, 0};
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("Kopia tablicy: " + Arrays.toString(zadanie5.copyArray(numbers)));
    }
}
