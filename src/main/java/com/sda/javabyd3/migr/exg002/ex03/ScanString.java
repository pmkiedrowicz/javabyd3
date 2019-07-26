package com.sda.javabyd3.migr.exg002.ex03;

import java.util.Scanner;

public class ScanString {

    public String word = "";

    public String scannString() {

        Scanner odczyt = new Scanner(System.in);
        System.out.println("podaj wyraz");
        word = odczyt.nextLine();
        return word;
    }
}
