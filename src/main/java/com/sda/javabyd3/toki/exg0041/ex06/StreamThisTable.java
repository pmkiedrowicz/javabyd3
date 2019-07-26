package com.sda.javabyd3.toki.exg0041.ex06;

import org.apache.commons.lang3.ArrayUtils;

import java.util.*;

public class StreamThisTable {
    public StreamThisTable() {
    }

    public int[] streamIntTable(int[] numbers) {

        double average;
        int howMuch = -5;
        int[] gettingOverAverage;

        average = Arrays.stream(numbers)
                .average()
                .getAsDouble();

        gettingOverAverage = Arrays.stream(numbers)
                .filter(e1 -> e1 > average)
                .sorted()
                .toArray();

        howMuch = howMuch + gettingOverAverage.length;

        ArrayUtils.reverse(gettingOverAverage);

        int[] gettingExactlyFiveElements = Arrays.stream(gettingOverAverage)
                .skip(howMuch)
                .sorted()
                .toArray();

        numbers = gettingExactlyFiveElements;

        System.out.println(Arrays.toString(numbers));
        return numbers;
    }
}
