package com.sda.javabyd3.jaja.exg001.ex01;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbę: ");
        numbers.add(scanner.nextInt());

        System.out.println("Podaj druga liczbę: ");
        numbers.add(scanner.nextInt());

        System.out.println("Podaj trzecią liczbę: ");
        numbers.add(scanner.nextInt());
        System.out.println(numbers);

        numbers.stream().sorted((numberOne, numberTwo) -> {
            System.out.println(numberOne + " " + numberTwo);
            return numberOne.compareTo(numberTwo);
        });


        int maxCollection = Collections.max(numbers);
        int minCollection = Collections.min(numbers);
        System.out.println("Największa liczba to: " + maxCollection);
        System.out.println("Najmniejsza liczba to: " + minCollection);

        int suma = numbers.stream().mapToInt(numberOne -> numberOne).sum();
        System.out.println("Pierwszy sposob obliczania sumy = " + suma);

        int suma2 = 0;
        for (int i = 0; i < numbers.size(); i++) {
            // suma +=numbers.get(i);
            suma2 = suma2 + numbers.get(i);
        }
        System.out.println("Drugi sposob obliczania sumy = " + suma2);

    }
}

