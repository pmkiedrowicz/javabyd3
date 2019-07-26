//Mając daną tablicę typu int[], przekonwertuj ją na strumień, a następnie znajdź sumę
//wszystkich liczb znajdujących się w tablicy.

package com.sda.javabyd3.wowa.exg004StreamLambda.ex04;

import java.util.stream.IntStream;

public class Stream_4 {
    public int sum(int[] numbers) {
        int sum = IntStream.of(numbers).sum();
        return sum;
    }
}
