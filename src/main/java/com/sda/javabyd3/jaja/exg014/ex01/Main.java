package com.sda.javabyd3.jaja.exg014.ex01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BackWords backWords = new BackWords();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo: ");
        String word = scanner.nextLine();
        System.out.println("Słowo wspak: " + backWords.backword(word, word.length()-1));
    }
}
