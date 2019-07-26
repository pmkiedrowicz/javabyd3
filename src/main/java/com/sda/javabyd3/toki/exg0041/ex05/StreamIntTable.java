package com.sda.javabyd3.toki.exg0041.ex05;

import java.util.Arrays;

public class StreamIntTable {
    public StreamIntTable() {
    }

    public int[] StreamThisIntTable(int[] numbers) {

        double average = Arrays.stream(numbers).average().getAsDouble();
        int numberOfElements = Arrays.stream(numbers)
                .filter(e1 -> e1 > average)
                .sorted()
                .toArray()
                .length;

        int[] arr = {numberOfElements};
        numbers = arr;

        return numbers;
    }
}
