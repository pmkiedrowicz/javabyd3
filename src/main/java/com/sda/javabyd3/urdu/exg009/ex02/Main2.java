package com.sda.javabyd3.urdu.exg009.ex02;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        FirstPrime firstPrime = new FirstPrime();
        FindNearestPrime findNearestPrime =  new FindNearestPrime();

        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę: ");
        Integer number = scanNumber.nextInt();

        System.out.println("Najbliższa liczba pierwsza to: "+ firstPrime.searchFirstPrime(number));  //metody moje
        System.out.println("Najbliższa liczba pierwsza to: "+ findNearestPrime.findPrime(number));  // metody z zajęć

    }
}
