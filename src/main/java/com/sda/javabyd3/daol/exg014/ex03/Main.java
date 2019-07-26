package com.sda.javabyd3.daol.exg014.ex03;


import static com.sda.javabyd3.lusi.introduction.Utils.displayTextAndGetValue;
import static com.sda.javabyd3.lusi.introduction.Utils.displayTextOnConsole;

public class Main {
    public static void main(String[] args) {
        String numberAsString = displayTextAndGetValue("Oblicz silnię: ", false);
        Integer number = Integer.parseInt(numberAsString);
        Factorial factorial = new Factorial();

        long start = System.nanoTime();
        displayTextOnConsole("silnia wynosi: " + factorial.calculate(number), true);
        long end = System.nanoTime();
        displayTextOnConsole("czas wykonania (rekurencja): " + (end-start), true);

        start = System.nanoTime();
        displayTextOnConsole("silnia wynosi: " + factorial.calculateUsingForLoop(number), true);
        end = System.nanoTime();
        displayTextOnConsole("czas wykonania (forloop): " + (end-start), true);
    }
}
