package com.sda.javabyd3.kawa.exg003.ogolne.ex01;

public class Main {
    public static void main(String[] args) {

        CheckerIfNumbIsEven weChecking = new CheckerIfNumbIsEven();
        ScannerOfThings weScaning = new ScannerOfThings();
        if(weChecking.checkingNumb(weScaning.scanningNumb()) == true){
            System.out.println("Liczba " + weScaning.numb + " jest liczba parzysta.");
        }else{
            System.out.println("Liczba " + weScaning.numb + " nie jest liczba parzysta.");
        }

    }
}

