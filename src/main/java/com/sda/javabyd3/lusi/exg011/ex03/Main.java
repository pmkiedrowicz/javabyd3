package com.sda.javabyd3.lusi.exg011.ex03;


import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        IntStream.rangeClosed(0, 19).forEach(e -> array[e] = random.nextInt(255));

        System.out.println("Tablica źródłowa - nieposortowana");
        System.out.println(Arrays.toString(array));

        int[] sortedArray = new CountingSort().sort(array);

        System.out.println("Tablica wynikowa - posortowana");
        System.out.println(Arrays.toString(sortedArray));
    }
}
