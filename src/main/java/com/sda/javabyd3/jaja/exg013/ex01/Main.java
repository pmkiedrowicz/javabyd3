package com.sda.javabyd3.jaja.exg013.ex01;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
//        numbers[3] = 4;
        numbers[4] = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pozycję w tablicy:");
        Integer position = scanner.nextInt();
        Optional number = Optional.ofNullable(numbers[position]);
        if (number.isPresent()){
            System.out.println("Objekt istnieje, a jego wartośc to: " + number.get());
        }else System.out.println("object nie istnieje.");
    }
}
