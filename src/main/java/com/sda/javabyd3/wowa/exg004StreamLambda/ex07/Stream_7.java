//Mając daną tablicę typu int[], przekonwertuj ją na strumień, a następnie oblicz
//pierwiastek kwadratowy wszystkich liczb. Każda wartość powinna być zaokrąglona
//do 2 miejsca po przecinku.

package com.sda.javabyd3.wowa.exg004StreamLambda.ex07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_7 {
    public double[] sqrtArray(int[] numbers) {
        List<Double> list = Arrays.stream(numbers)
                .mapToDouble(n -> n)
                .map(n -> Math.sqrt(n))
                .boxed()
                .collect(Collectors.toList());

        double[] arr = list.stream()
                .mapToDouble(n -> n)
                .toArray();

        //System.out.print(Arrays.toString(arr) + " ");
        return arr;
    }

    public void printArr(int[] numbers) {
        System.out.print("input array: ");
        for (int x : numbers) {
            System.out.print(x + " ");
        }
        System.out.println("");
    }

    public void printSqrtArr(int[] numbers) {
        System.out.print("sqrt from array rounded: ");
        for (double x : sqrtArray(numbers))
            System.out.print(String.format("%.2f", x) + " ");
    }
}
