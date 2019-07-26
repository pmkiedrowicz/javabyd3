package com.sda.javabyd3.migr.exg002.ex05;

import com.sda.javabyd3.migr.exg002.ex03.ScanString;

public class Main25 {

    public static void main(String[] args) {

        ScanString word = new ScanString();
        PalindromeChecker check = new PalindromeChecker();

        if (check.isPalindrome(word.scannString())) {
            System.out.println("Wpisany tekst <" + check.x + "> jest palindromem");
        } else {
            System.out.println("Wpisany tekst <" + check.x + "> nie jest palindromem");
        }


    }
}
