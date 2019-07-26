//Mając daną tablicę typu int[], przekonwertuj ją na strumień, a następnie znajdź ilość
//liczb większych od średniej wartości wszystkich elementów przechowywanych w
//tablicy.

package com.sda.javabyd3.wowa.exg004StreamLambda.ex05;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream_5 {
    public int howManyHigherThanAverageValue(int[] numbers) {
        double average = IntStream.of(numbers)
                .average().getAsDouble();
        List<Integer> numbOfHigher = IntStream.of(numbers)
                .filter(s -> s > average)
                .boxed()
                .collect(Collectors.toList());

        return numbOfHigher.size();
    }
}
