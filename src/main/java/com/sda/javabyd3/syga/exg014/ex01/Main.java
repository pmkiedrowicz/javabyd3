package com.sda.javabyd3.syga.exg014.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BackwordRekurencja backwordRekurencja = new BackwordRekurencja();
        BackwordBezRekurencji backwordBezRekurencji = new BackwordBezRekurencji();
        String word;
        System.out.println("Enter words: ");
        word = scanner.nextLine();
        long start = System.nanoTime();
        System.out.println(backwordRekurencja.backwords(word, word.length()-1));
        long end = System.nanoTime();
        System.out.println("Czas z rekurencją: " + (end - start));

        start = System.nanoTime();
        System.out.println(backwordBezRekurencji.backword(word, word.length()));
        end = System.nanoTime();
        System.out.println("Czas bez rekurencji: " + (end - start));

    }
}
