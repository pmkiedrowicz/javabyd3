package com.sda.javabyd3.mabr.zadania003;

import java.util.Scanner;

public class MainPalindrome {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        Palindrome zad5 = new Palindrome();
        if (zad5.palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
