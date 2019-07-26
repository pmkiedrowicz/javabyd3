package com.sda.javabyd3.kawa.exg003.ogolne.ex4;

import com.sda.javabyd3.kawa.exg003.ogolne.ex01.ScannerOfThings;

public class Main {
    public static void main(String[] args) {

        ScannerOfThings scanUglyText = new ScannerOfThings();
        LetterConverter myConvertedLetters = new LetterConverter();
        System.out.println(myConvertedLetters.convertingSomeLetters(scanUglyText.scanText()));
    }
}
