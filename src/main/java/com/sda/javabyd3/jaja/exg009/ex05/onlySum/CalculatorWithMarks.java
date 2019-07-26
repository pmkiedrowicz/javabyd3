package com.sda.javabyd3.jaja.exg009.ex05.onlySum;

import java.util.Arrays;
import java.util.stream.Stream;

public class CalculatorWithMarks {

    public int sum(String text){
        if (text.isEmpty())
            return 0;
        Stream<String> numbers = Arrays.stream(text.split("\\+"));
        return numbers.mapToInt(Integer::parseInt).sum();
    }
}
