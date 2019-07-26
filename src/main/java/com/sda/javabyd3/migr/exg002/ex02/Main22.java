package com.sda.javabyd3.migr.exg002.ex02;

import com.sda.javabyd3.migr.exg002.ex01.ScanNum;

public class Main22 {
    public static void main(String[] args) {

        ScanNum scanner = new ScanNum();
        PrimeChecker num = new PrimeChecker();


        if (num.isPrime(scanner.scannNum())) {
            System.out.println("nie jest pierwsza");
        } else {
            System.out.println("jest pierwsza ");
        }


    }
}
