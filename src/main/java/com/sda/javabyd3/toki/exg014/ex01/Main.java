package com.sda.javabyd3.toki.exg014.ex01;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Backwarder backwarder = new Backwarder();

        System.out.print("Type a word: ");
        String word = scanner.next();

        System.out.println("Word backwards: ");
        System.out.print(backwarder.backwards(word, word.length() - 1));
    }
}
