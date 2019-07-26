//Mając daną tablicę typu int[], przekonwertuj ją na strumień, posortuj rosnąco, a
//następnie znajdź wartość średnią pięciu elementów większych od wartości średniej
//wszystkich elementów przechowywanych w tablicy

package com.sda.javabyd3.wowa.exg004StreamLambda.ex06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream_6 {
    public double avgOf5NumbersHigherThanAvg(int[] numbers) {
        Arrays.sort(numbers);
        System.out.print(Arrays.toString(numbers));

        double avgAll = IntStream.of(numbers)
                .average().getAsDouble();
        System.out.println("\naverageAll: " + avgAll);

        List<Integer> list = Arrays.stream(numbers)
                .filter(n -> n > avgAll)
                .limit(5)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("5 elements higher than averageAll: " + list);

        Double avgOf5 = list.stream()
                .collect(Collectors.averagingInt(n -> n));

        return avgOf5;
    }
}
