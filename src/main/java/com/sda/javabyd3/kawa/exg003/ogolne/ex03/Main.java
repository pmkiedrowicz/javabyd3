package com.sda.javabyd3.kawa.exg003.ogolne.ex03;

import com.sda.javabyd3.kawa.exg003.ogolne.ex01.ScannerOfThings;

public class Main {
    public static void main(String[] args) {

        ScannerOfThings scannedText = new ScannerOfThings();
        TextReverser textToReverse = new TextReverser();
        System.out.println(textToReverse.reversingText(scannedText.scanText()));
    }
}
