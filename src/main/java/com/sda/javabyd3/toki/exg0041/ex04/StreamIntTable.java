package com.sda.javabyd3.toki.exg0041.ex04;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamIntTable {
    public StreamIntTable() {
    }

    public int[] StreamThisIntTable(int[] numbers) {

        IntStream intStream = IntStream.of(Arrays.stream(numbers).sum());
        int sum = intStream.findFirst().getAsInt();
        numbers = new int[1];
        numbers[0] = sum;
        System.out.println(Arrays.toString(numbers));

        return numbers;
    }
}
