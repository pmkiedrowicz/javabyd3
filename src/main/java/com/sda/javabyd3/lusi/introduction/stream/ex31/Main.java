package com.sda.javabyd3.lusi.introduction.stream.ex31;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    private static Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        int[] randomNumbers = new int[10];
        IntStream.rangeClosed(0, 9).forEach(i -> randomNumbers[i] = random.nextInt(100));
        Arrays.stream(randomNumbers).forEach(number -> System.out.print(number + " "));
        System.out.println();
        Arrays.stream(randomNumbers).map(number -> number * 2).forEach(number -> System.out.print(number + " "));
    }
}
