package com.sda.javabyd3.syga.exg014.ex03;

import com.sda.javabyd3.lusi.introduction.Utils;

public class Main {
    public static void main(String[] args) {
        String numberAsString = Utils.displayTextAndGetValue("Oblicz silnię: ", false);
        Integer number = Integer.parseInt(numberAsString);
        Factorial factorial = new Factorial();
        long start = System.nanoTime();
        Utils.displayTextOnConsole("Silnia wynosi " + factorial.calculate(number));
        long end = System.nanoTime();
        Utils.displayTextOnConsole("Czas wykonania (rekurencja): " + (end - start));

        start = System.nanoTime();
        Utils.displayTextOnConsole("Silnia wynosi " + factorial.calculateUsingForLoop(number));
        end = System.nanoTime();
        Utils.displayTextOnConsole("Czas wynosi " + (end -start));
    }
}
