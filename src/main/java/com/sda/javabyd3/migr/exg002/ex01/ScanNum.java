package com.sda.javabyd3.migr.exg002.ex01;

import java.util.Scanner;

public class ScanNum {

    public int num;
    public int scannNum() {

        Scanner odczyt = new Scanner(System.in);
        System.out.println("podaj liczbe do sprawdzenia");
        num = odczyt.nextInt();
        return num;

}}
