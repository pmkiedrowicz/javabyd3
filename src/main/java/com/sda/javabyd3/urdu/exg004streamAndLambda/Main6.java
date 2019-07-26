package com.sda.javabyd3.urdu.exg004streamAndLambda;

import java.util.Arrays;
import java.util.OptionalDouble;

import static java.util.Arrays.stream;

public class Main6 {

    public static void main(String[] args) {

        int[] numbers = new int[]{148, 105, 36, 37, 56, 132, 121, 36, 180,
                8, 61, 171, 180, 6, 65, 0, 66, 58, 162, 25, 128, 35, 32, 4, 104,
                6, 75, 31, 66, 125, 188, 159, 121, 61, 173, 188, 34, 141, 182,
                192, 18, 18, 165, 136, 76, 64, 41, 195, 147, 74};
        OptionalDouble aver = stream(numbers).average();
        int averInt = (int) aver.getAsDouble();
        int[] sorted = stream(numbers).sorted().
                filter(num -> num > averInt).
                limit(5).
                toArray();

        System.out.println(Arrays.toString(sorted));

        OptionalDouble averFiveEl = stream(sorted).average();

        System.out.println("średnia 5 elementów większych od średniej wszystkich to : " + averFiveEl.getAsDouble());

    }
}
