package com.sda.javabyd3.kawa.exg014.ex01;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz lub zdanie do odwrocenia: ");
        String wpis = scanner.nextLine();
        int lengthOfWpis = wpis.length() - 1;

        long timeOfRecurency = System.nanoTime();
        WordsReverser wordsReverser = new WordsReverser();
        System.out.println(wordsReverser.reversingWords(wpis, lengthOfWpis));
        timeOfRecurency = System.nanoTime() - timeOfRecurency;
        System.out.println("Czas rekurencji - " + timeOfRecurency);

        long timeOfForMethod = System.nanoTime();
        System.out.println(wordsReverser.reversingWordsOtherMethod(wpis, lengthOfWpis));
        timeOfForMethod = System.nanoTime() - timeOfForMethod;
        System.out.println("Czas metody for - " + timeOfForMethod);

        System.out.println("Roznica miedzy czasem rekurencji a czesem metody for = " + (timeOfRecurency
                -timeOfForMethod) + " nanoSekund");
    }
}
