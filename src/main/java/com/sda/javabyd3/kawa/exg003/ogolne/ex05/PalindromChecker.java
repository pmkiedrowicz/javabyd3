package com.sda.javabyd3.kawa.exg003.ogolne.ex05;

public class PalindromChecker {

    String newPalin;

    public boolean checkingIfPalindrom(String arg) {
        newPalin = arg;
        newPalin =  newPalin.replaceAll("\\s","").toLowerCase();
        return newPalin.equals(new StringBuilder(newPalin).reverse().toString());
    }
}