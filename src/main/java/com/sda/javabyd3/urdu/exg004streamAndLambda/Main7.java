package com.sda.javabyd3.urdu.exg004streamAndLambda;


import java.util.Arrays;

import static java.lang.Math.sqrt;
import static java.util.Arrays.stream;

public class Main7 {
    public static void main(String[] args) {

        int[] numbers = new int[]{148, 105, 36, 37, 56, 132, 121, 36, 180,
                8, 61, 171, 180, 6, 65, 0, 66, 58, 162, 25, 128, 35, 32, 4, 104,
                6, 75, 31, 66, 125, 188, 159, 121, 61, 173, 188, 34, 141, 182,
                192, 18, 18, 165, 136, 76, 64, 41, 195, 147, 74};

      double[] numbersD = stream(numbers).mapToDouble(num -> roundToTwo( sqrt(num))).toArray();
        System.out.println("Pierwiastki: " + Arrays.toString(numbersD));

    }

    public static double roundToTwo(double num) {
        num *= 100;
        num= Math.round(num);
        num /= 100;
         return num;
    }
}
