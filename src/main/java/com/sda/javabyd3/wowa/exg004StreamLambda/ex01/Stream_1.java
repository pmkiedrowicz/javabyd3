//Mając daną tablicę typu int[], przekonwertuj ją na strumień, a następnie znajdź
//maksymalną wartość.

package com.sda.javabyd3.wowa.exg004StreamLambda.ex01;

import java.util.stream.IntStream;

public class Stream_1 {
    public int maxValue(int[] numbers) {
        int max = IntStream.of(numbers).max().getAsInt();
        return max;
    }
}
