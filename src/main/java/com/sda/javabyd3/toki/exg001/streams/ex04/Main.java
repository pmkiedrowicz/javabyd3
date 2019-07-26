package com.sda.javabyd3.toki.exg001.streams.ex04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Integer[] numbers={14,3,522,22,64,23};

        List<Integer> minNumber= Arrays.stream(numbers)
                .sorted((e1, e2)->e1.compareTo(e2))
                .collect(Collectors.toList());

        System.out.println(minNumber.get(0));

        List<Integer> maxNumber=Arrays.stream(numbers)
                .sorted((e1, e2)->e2.compareTo(e1))
                .collect(Collectors.toList());

        System.out.println(maxNumber.get(0));

    }
}
