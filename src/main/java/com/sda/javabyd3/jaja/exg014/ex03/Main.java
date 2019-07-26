package com.sda.javabyd3.jaja.exg014.ex03;

import static com.sda.javabyd3.lusi.introduction.Utils.displayTextAndGetValue;
import static com.sda.javabyd3.lusi.introduction.Utils.displayTextOnConsole;

public class Main {
    public static void main(String[] args) {

        String numberAsString = displayTextAndGetValue("Oblicz silnię: ",false);
        Integer number = Integer.parseInt(numberAsString);
        Factorial factorial = new Factorial();
        long start = System.nanoTime();
        displayTextOnConsole("Silnia wynosi: " + factorial.calculate(number));
        long end = System.nanoTime();
        displayTextOnConsole("czas wykonania: " + (end-start) + " ns.");
        start = System.nanoTime();
        displayTextOnConsole("Silnia za pomocą pętli: " + factorial.calculateUsingForLoop(number));
        end = System.nanoTime();
        displayTextOnConsole("czas wykonania: " + (end-start) + " ns.");
    }
}
