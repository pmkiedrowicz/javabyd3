package com.sda.javabyd3.urdu.recursion014.ex03;

import static com.sda.javabyd3.lusi.introduction.Utils.displayTextAndGetValue;
import static com.sda.javabyd3.lusi.introduction.Utils.displayTextOnConsole;

public class Main {

    public static void main(String[] args) {

        String numberAsString = displayTextAndGetValue("Oblicz silnię: ", false);
        Integer number = Integer.parseInt(numberAsString);
        Factorial factorial = new Factorial();
        long start = System.nanoTime();

        displayTextOnConsole("Silnia wynosi " + factorial.calculate(number));
        long end = System.nanoTime();
        System.out.println("czas z rekursji to: " + (end - start) + "ms");

        start = System.nanoTime();
        displayTextOnConsole("Silnia wynosi z pętli " + factorial.calculateWithLoop(number));
        end = System.nanoTime();
        System.out.println("Czas z pętli to :" + (end - start) + "ms");
    }
}
