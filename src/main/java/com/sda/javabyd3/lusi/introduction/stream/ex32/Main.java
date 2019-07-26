package com.sda.javabyd3.lusi.introduction.stream.ex32;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    private static Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) {

        int[] randomNumbers = new int[20];
        IntStream.rangeClosed(0, 19).forEach(i -> randomNumbers[i] = random.nextInt(101) + 100);
        Arrays.stream(randomNumbers).forEach(number -> System.out.print(number + " "));
        System.out.println();
        // Rosnąco
        Arrays.stream(randomNumbers).boxed().sorted(Comparator.naturalOrder()).forEach(number -> System.out.print(number + " "));
        System.out.println();
        // Malejąco
        Arrays.stream(randomNumbers).boxed().sorted(Comparator.reverseOrder()).forEach(number -> System.out.print(number + " "));
    }
}
