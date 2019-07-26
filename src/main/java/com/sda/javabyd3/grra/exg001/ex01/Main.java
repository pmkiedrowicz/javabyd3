package com.sda.javabyd3.grra.exg001.ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        listOfNumbers.add(scanner.nextInt());
        System.out.println("Podaj drugą liczbę ");
        listOfNumbers.add(scanner.nextInt());
        System.out.println("Podaj trzecią liczbę");
        listOfNumbers.add(scanner.nextInt());
        System.out.println("Największa liczba: " + Collections.max(listOfNumbers));
        System.out.println("Najmniejsza liczba: " + Collections.min(listOfNumbers));

        Integer sum = 0;
        for(Integer d : listOfNumbers) {
            sum += d;
        }

        System.out.println("Suma wszystkich liczb: " + sum);
    }
}
