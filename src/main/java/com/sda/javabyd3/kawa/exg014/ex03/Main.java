package com.sda.javabyd3.kawa.exg014.ex03;

import static com.sda.javabyd3.lusi.introduction.Utils.displayTextAndGetValue;
import static com.sda.javabyd3.lusi.introduction.Utils.displayTextOnConsole;

public class Main {
    public static void main(String[] args) {
        String numberAsString = displayTextAndGetValue ("Oblicz silnie ", false);
        Integer number = Integer.parseInt(numberAsString);
        Factorial factorial = new Factorial();

        long start = System.nanoTime();
        displayTextOnConsole("Silnia wynosi " + factorial.calculate(number));
        long end = System.nanoTime() - start;
        System.out.println("Czas wykonania - rekurencja - " + end + " ns.");

        start = System.nanoTime();
        displayTextOnConsole("Silnia wynosi " + factorial.calculateUsingFor(number));
        end = System.nanoTime() - start;
        System.out.println("Czas wykonania - petla for - " + end + " ns.");


    }
}
