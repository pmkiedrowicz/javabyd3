package com.sda.javabyd3.daol.exg014.ex01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Backwards backwards = new Backwards();
        System.out.println("Please enter word to backwards: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println("Backword: " + Backwards.backwards(word, word.length() - 1));
    }
}
