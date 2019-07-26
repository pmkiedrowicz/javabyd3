package com.sda.javabyd3.kawa.exg014.ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita do ktorej beda dodawane kolejne liczby i wyswietlona suma: ");

        int enteredNumber = 0;
        try {
            enteredNumber = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Podany znak nie jest liczba!");
        }

        NSumerForEx02 nSumerForEx02 = new NSumerForEx02();
        long start = System.nanoTime();
        System.out.println(nSumerForEx02.summingNTimes(enteredNumber));
        long end = System.nanoTime() - start;
        System.out.println("Czas wykonania rekurencja - " + end);

        start = System.nanoTime();
        System.out.println(nSumerForEx02.summingNTimesWithForLoop(enteredNumber));
        end = System.nanoTime() - start;
        System.out.println("Czas wykonania loopem for - " +end);
    }
}
