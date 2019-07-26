package com.sda.javabyd3.toki.exg003general.general;

import com.sda.javabyd3.toki.exg003general.general.ex01.Checker;
import com.sda.javabyd3.toki.exg003general.general.ex02.PrimeChecker;
import com.sda.javabyd3.toki.exg003general.general.ex03.Reverser;
import com.sda.javabyd3.toki.exg003general.general.ex04.CharacterChecker;
import com.sda.javabyd3.toki.exg003general.general.ex05.PalindromChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        String text = null;
        String polishText = null;
        String palindrom = null;
        String palindromForEqual = null;


        Scanner scanner = new Scanner(System.in);
        Scanner textToScan = new Scanner(System.in);
        Scanner textToChange = new Scanner(System.in);
        Scanner palindromToCheck = new Scanner(System.in);

        Checker checker = new Checker();
        PrimeChecker primeChecker = new PrimeChecker();
        Reverser reverser = new Reverser();
        CharacterChecker characterChecker = new CharacterChecker();
        PalindromChecker palindromChecker = new PalindromChecker();


        try {
            System.out.println("Insert a number e.g. 123, -521: ");
            number = scanner.nextInt();
            checker.checker(number);
            primeChecker.number(number);

            System.out.println("Insert text e.g. Java, 34wheel: ");
            text = textToScan.next();
            reverser.textToReverse(text);

            System.out.println("Insert a polish text e.g. Zażółć gęślą jaźń: ");
            polishText = textToChange.nextLine();
            characterChecker.changeCharacter(polishText);

            System.out.println("Insert text to palindrom e.g. Może jutro ta dama da tortu jeżom: ");
            palindrom = palindromToCheck.nextLine();
            palindromChecker.checkForPalindrom(palindrom, palindromForEqual);


        } catch (Exception e) {
            e.getCause();
            System.out.println("Invalid argument");
        }

    }
}
