package com.sda.javabyd3.kawa.exg003.ogolne.ex05;

import com.sda.javabyd3.kawa.exg003.ogolne.ex01.ScannerOfThings;

public class Main {
    public static void main(String[] args) {

        ScannerOfThings scanMyPalindom = new ScannerOfThings();
        PalindromChecker palindromChecker = new PalindromChecker();
        if (palindromChecker.checkingIfPalindrom(scanMyPalindom.scanText())) {
            System.out.println("Wpisany text -> " + palindromChecker.newPalin + " <- jest Palindomem");
        } else {
            System.out.println("Wpisany text -> " + palindromChecker.newPalin + " <-  nie jest Palindomem");
        }
    }
}
