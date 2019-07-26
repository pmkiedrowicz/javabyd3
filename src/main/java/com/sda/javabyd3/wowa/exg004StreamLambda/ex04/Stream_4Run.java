//Mając daną tablicę typu int[], przekonwertuj ją na strumień, a następnie znajdź sumę
//wszystkich liczb znajdujących się w tablicy.

package com.sda.javabyd3.wowa.exg004StreamLambda.ex04;

public class Stream_4Run {
    public static void main(String[] args) {
        int[] numbers = new int[]{148, 105, 36, 37, 56, 132, 121, 36, 180,
                8, 61, 171, 180, 6, 65, 0, 66, 58, 162, 25, 128, 35, 32, 4, 104,
                6, 75, 31, 66, 125, 188, 159, 121, 61, 173, 188, 34, 141, 182,
                192, 18, 18, 165, 136, 76, 64, 41, 195, 147, 74};

        Stream_4 zad4 = new Stream_4();
        System.out.println(zad4.sum(numbers));
    }
}
