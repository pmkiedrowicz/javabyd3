package com.sda.javabyd3.toki.exg0041.ex01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamIntTable {
    public StreamIntTable() {
    }

    public int[] StreamThisIntTable(int[] numbers) {

        IntStream intStream = IntStream.of(Arrays.stream(numbers).max().getAsInt());
        int max = intStream.findFirst().getAsInt();
        numbers= new int[1];
        numbers[0]=max;
        System.out.println(Arrays.toString(numbers));

        return numbers;
    }
}
