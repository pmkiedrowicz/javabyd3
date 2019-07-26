package com.sda.javabyd3.daol.exg0041;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{148, 105, 36, 37, 56, 132, 121, 36, 180,
                8, 61, 171, 180, 6, 65, 0, 66, 58, 162, 25, 128, 35, 32, 4, 104,
                6, 75, 31, 66, 125, 188, 159, 121, 61, 173, 188, 34, 141, 182,
                192, 18, 18, 165, 136, 76, 64, 41, 195, 147, 74};

        System.out.println("Wartość maksymalna: ");
        System.out.println(Arrays.stream(numbers).max().getAsInt());
        System.out.println("Wartość minimalna: ");
        System.out.println(Arrays.stream(numbers).min().getAsInt());
        System.out.println("Wartość średnia z tablicy: ");
        System.out.println(Arrays.stream(numbers).average().getAsDouble());
        System.out.println("Suma liczb z tablicy: ");
        System.out.println(Arrays.stream(numbers).sum());
        System.out.println("Ilość liczb większych niż średnia z tablicy: ");
//        System.out.println(Arrays.stream(numbers));



    }

}
