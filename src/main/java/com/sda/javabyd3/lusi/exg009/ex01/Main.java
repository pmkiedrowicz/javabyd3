package com.sda.javabyd3.lusi.exg009.ex01;

import com.sda.javabyd3.lusi.introduction.TextColor;
import com.sda.javabyd3.lusi.introduction.Utils;

import java.util.Scanner;

/**
 * Napisz program, który umożliwi użytkownikowi wpisanie dowolnej liczby
 * całkowitej z * zakresu [1-99], po czym wyświetli ją w konsoli w postaci
 * słownej. Np. 23 -> * dwadzieścia trzy
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź liczbę: ");
        int number = scanner.nextInt();
        String numberAsText = new NumberConverter().convertToString(number);
        System.out.println();
        Utils.displayTextOnConsole(number + " = " + numberAsText, TextColor.ANSI_GREEN);
    }
}
