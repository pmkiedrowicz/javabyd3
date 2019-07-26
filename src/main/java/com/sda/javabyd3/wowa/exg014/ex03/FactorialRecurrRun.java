//Napisz program, który oblicza n-ty wyraz silni za pomocą rekurencji. Napisz również
//program bez rekurencji i porównaj czas wykonania.

package com.sda.javabyd3.wowa.exg014.ex03;

import static com.sda.javabyd3.lusi.introduction.Utils.displayTextAndGetValue;
import static com.sda.javabyd3.lusi.introduction.Utils.displayTextOnConsole;

public class FactorialRecurrRun {
    public static void main(String[] args) {
        String numberAsString = displayTextAndGetValue("Enter factorial to count: ", false);
        Integer number = Integer.parseInt(numberAsString);
        FactorialRecurr factorial = new FactorialRecurr();

        long start = System.nanoTime();
        displayTextOnConsole("factorial using recurr: " + factorial.calculateRecurr(number));
        long end = System.nanoTime() - start;
        System.out.println("factorial using recurr time: " + end + " ns.");

        start = System.nanoTime();
        displayTextOnConsole("factorial using iter: " + factorial.calculateIter(number));
        end = System.nanoTime() - start;
        System.out.println("factorial using iter time: " + end + " ns.");
    }
}
