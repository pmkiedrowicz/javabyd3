package com.sda.javabyd3.jaja.exg041.ex05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numbers = { 148 , 105 , 36 , 37 , 56 , 132 , 121 , 36 , 180 ,
                8 , 61 , 171 , 180 , 6 , 65 , 0 , 66 , 58 , 162 , 25 , 128 , 35 , 32 , 4 , 104 ,
                6 , 75 , 31 , 66 , 125 , 188 , 159 , 121 , 61 , 173 , 188 , 34 , 141 , 182 ,
                192 , 18 , 18 , 165 , 136 , 76 , 64 , 41 , 195 , 147 , 74 };

        System.out.println("Wartości większe od średniej: ");
                Arrays.stream(numbers)
                 .filter(n1 -> n1 > Arrays.stream(numbers).average().getAsDouble())
                 .sorted()
                 .forEach(n1 -> System.out.println(n1));
    }
}

