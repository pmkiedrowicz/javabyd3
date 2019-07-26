package com.sda.javabyd3.daol.exg003.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        //Zad4 zad4 = new Zad4();
        DiacriticWord diacriticWord = new DiacriticWord();
        System.out.println("Podaj zdanie: ");
         System.out.println("Zwrotka: " + diacriticWord.toEngCharacters( scanner.nextLine() ));
//        System.out.println("Zwrotka: " + diacriticWord.changeCharacters( scanner.nextLine() ));
    }
}





