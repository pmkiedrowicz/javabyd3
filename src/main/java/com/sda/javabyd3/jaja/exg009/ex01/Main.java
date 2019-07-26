package com.sda.javabyd3.jaja.exg009.ex01;

import java.util.Scanner;

/**
 * Napisz program, który umożliwi użytkownikowi wpisanie dowolnej liczby całkowitej z
 * zakresu [1-99], po czym wyświetli ją w konsoli w postaci słownej.
 * Np. 23 ->dwadzieścia trzy.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        Integer number = scanner.nextInt();
        String numberAsTeXt = new NumberConverter().convertToString(number);
        System.out.println(number + " = " + numberAsTeXt);
        Utils.displayTextOnConsole(number + " = " + numberAsTeXt, TextColor.ANSI_GREEN);
    }
}
