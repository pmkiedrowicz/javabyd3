package com.sda.javabyd3.toki.exg0041.ex03;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamIntTable {
    public StreamIntTable() {
    }

    public int[] StreamThisIntTable(int[] numbers) {

        IntStream intStream = IntStream.of((int) Arrays.stream(numbers).average().getAsDouble());
        int average = intStream.findFirst().getAsInt();
        numbers = new int[1];
        numbers[0] = average;
        System.out.println(Arrays.toString(numbers));

        return numbers;
    }
}
