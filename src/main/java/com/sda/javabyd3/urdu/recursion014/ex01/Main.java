package com.sda.javabyd3.urdu.recursion014.ex01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ReverseText reverseText = new ReverseText();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst do odrócenia: ");
        String text = scanner.nextLine();
        String reverse = reverseText.backwards(text, text.length() - 1);

        String reverseLoop = reverseText.backLoop(text);

        System.out.println("Odwrócony tekst to: " + reverse);
        System.out.println("Odwrócony tekst z pętli to: " + reverseLoop);


    }
}
