package com.sda.javabyd3.jaja.exg003.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CheckEvenOrOdd checkEvenOrOdd = new CheckEvenOrOdd();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        Integer number = scanner.nextInt();
        System.out.println(checkEvenOrOdd.checkEvenNumber(number)? "Liczba jest parzysta" : "Liczba jest nie parzysta");
    }

}
