package com.sda.javabyd3.toki.exg0041.ex02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamIntTable {
    public StreamIntTable() {
    }

    public int[] StreamThisIntTable(int[] numbers) {

        IntStream intStream = IntStream.of(Arrays.stream(numbers).min().getAsInt());
        int min = intStream.findFirst().getAsInt();
        numbers= new int[1];
        numbers[0]=min;
        System.out.println(Arrays.toString(numbers));

        return numbers;
    }
}
