//Mając daną tablicę typu int[], przekonwertuj ją na strumień, posortuj rosnąco, a
//następnie znajdź wartość średnią pięciu elementów większych od wartości średniej
//wszystkich elementów przechowywanych w tablicy

package com.sda.javabyd3.wowa.exg004StreamLambda.ex06;

public class Stream_6Run {
    public static void main(String[] args) {
        int[] numbers = new int[]{148, 105, 36, 37, 56, 132, 121, 36, 180,
                8, 61, 171, 180, 6, 65, 0, 66, 58, 162, 25, 128, 35, 32, 4, 104,
                6, 75, 31, 66, 125, 188, 159, 121, 61, 173, 188, 34, 141, 182,
                192, 18, 18, 165, 136, 76, 64, 41, 195, 147, 74};

        Stream_6 zad6 = new Stream_6();
        System.out.println("avg of 5 elements higher than avgAll: " + zad6.avgOf5NumbersHigherThanAvg(numbers));
    }
}
