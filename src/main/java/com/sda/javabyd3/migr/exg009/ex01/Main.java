package com.sda.javabyd3.migr.exg009.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę: ");
        int number = scanner.nextInt();
        String numberAsText = new NumberConverter().convertToString(number);
        System.out.println(number + " " + numberAsText);

    }

}
