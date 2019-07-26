package com.sda.javabyd3.mabr.zadania0041;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zad6 {
    public static void main(String[] args) {
        int[] numbers = new int[]{148, 105, 36, 37, 56, 132, 121, 36, 180,
                8, 61, 171, 180, 6, 65, 0, 66, 58, 162, 25, 128, 35, 32, 4, 104,
                6, 75, 31, 66, 125, 188, 159, 121, 61, 173, 188, 34, 141, 182,
                192, 18, 18, 165, 136, 76, 64, 41, 195, 147, 74};

        Arrays.sort(numbers);
        System.out.print("Sorted in ascending order: ");
        System.out.println(Arrays.toString(numbers));

        double average = Arrays.stream(numbers).average().getAsDouble();
        List<Integer> result = Arrays.stream(numbers)
                .filter(i -> i > average)
                .boxed()
                .collect(Collectors.toList());
        System.out.print("Numbers greater than average: ");
        System.out.println(result);

        result.stream()
                .skip(18)
                .mapToInt(i -> i)
                .average()
                .ifPresent(avg -> System.out.println("Average of 5 numbers greater than average: " + avg));
    }
}
