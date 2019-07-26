package com.sda.javabyd3.syga.exg003;

import com.sda.javabyd3.syga.exg003.ex01.EvenOrOdd;
import com.sda.javabyd3.syga.exg003.ex02.PrimeNumber;
import com.sda.javabyd3.syga.exg003.ex03.Reverse;
import com.sda.javabyd3.syga.exg003.ex04.ChangeOfCharakters;
import com.sda.javabyd3.syga.exg003.ex05.Palindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 0;
        String text = "";
        String textPolish = "";
        String palindromText = null;
        String palindromTextRevers = null;

        Scanner scannerNumber = new Scanner(System.in);
        Scanner scannerText = new Scanner(System.in);
        Scanner scannerText2 = new Scanner(System.in);
        Scanner scannerText3 = new Scanner(System.in);
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        PrimeNumber primeNumber = new PrimeNumber();
        Reverse reverse = new Reverse();
        ChangeOfCharakters changeOfCharakters = new ChangeOfCharakters();
        Palindrome palindrome = new Palindrome();

        System.out.println("Podaj liczbę: ");
        try {
            number = scannerNumber.nextInt();
            evenOrOdd.check(number); // sprawdza czy liczba jest parzysta czy nieparzysta
            primeNumber.CheckNumber(number); // sprawdza czy podana liczba jest liczbą pierwszą
            System.out.println("Podaj słowo: ");
            text = scannerText.nextLine();
            reverse.textReverse(text); //odwraca tekst

            System.out.println("Podaj tekst: ");
            textPolish = scannerText2.nextLine();
            changeOfCharakters.changeCharakters(textPolish); // zmienia polskie znaki typu ąęćś na aecs.

            System.out.println("Podaj tekst: ");
            palindromText = scannerText3.nextLine();
            palindrome.palindromeText(palindromText);





        } catch (Exception e) {
            e.getCause();
            System.out.println("To nie jest liczba.");
        }


    }
}
