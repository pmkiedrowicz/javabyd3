package com.sda.javabyd3.kawa.exg003.ogolne.ex02;

import com.sda.javabyd3.kawa.exg003.ogolne.ex01.ScannerOfThings;

public class Main {
    public static void main(String[] args) {

        ScannerOfThings scanForEx2 = new ScannerOfThings();
        CheckerIfNumbIsPrime checkMyNumb = new CheckerIfNumbIsPrime();
        if(checkMyNumb.checkIfPrime(scanForEx2.scanningNumb()) == true){
            System.out.println("Liczba " + scanForEx2.numb + " jest liczba pierwsza.");
        }else {
            System.out.println("Liczba " + scanForEx2.numb + " nie jest liczba pierwsza");
        }
    }
}
