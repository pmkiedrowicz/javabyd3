package com.sda.javabyd3.jaja.zadania_dodatkowe001.exg001.ex01;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {

        Random random = new Random();
        int winNumber = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        int hit = 0;
        do {
            System.out.println("Podaj liczbę: ");
            userNumber = scanner.nextInt();
            if (userNumber > winNumber) {
                System.out.println("Wprowadzona liczba jest większa od wylosowanej. Gramy dalej! Celuj niżej.");
            } else if (userNumber < winNumber) {
                System.out.println("Wprowadzona liczba jest mniejsza od wylosowanej. Gramy dalej! Celuj wyżej.");
            }
            hit++;
        } while (userNumber != winNumber);
        System.out.println("Gratuluję, wygrałeś! Twój wynik to: " + hit + " trafień.");
    }
}

