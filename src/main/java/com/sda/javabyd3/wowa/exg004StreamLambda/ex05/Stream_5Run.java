//Mając daną tablicę typu int[], przekonwertuj ją na strumień, a następnie znajdź ilość
//liczb większych od średniej wartości wszystkich elementów przechowywanych w
//tablicy.

package com.sda.javabyd3.wowa.exg004StreamLambda.ex05;

public class Stream_5Run {
    public static void main(String[] args) {
        int[] numbers = new int[]{148, 105, 36, 37, 56, 132, 121, 36, 180,
                8, 61, 171, 180, 6, 65, 0, 66, 58, 162, 25, 128, 35, 32, 4, 104,
                6, 75, 31, 66, 125, 188, 159, 121, 61, 173, 188, 34, 141, 182,
                192, 18, 18, 165, 136, 76, 64, 41, 195, 147, 74};

        Stream_5 zad5 = new Stream_5();
        System.out.println(zad5.howManyHigherThanAverageValue(numbers));
    }
}

