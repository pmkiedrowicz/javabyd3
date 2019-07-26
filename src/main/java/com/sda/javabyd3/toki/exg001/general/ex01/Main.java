package com.sda.javabyd3.toki.exg001.general.ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Podaj trzy liczby, kazda oddzielaj enterem:\n");

        int tabInt[] = new int[3];
        int suma = 0;

        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            tabInt[i] = scanner1.nextInt();
            suma += tabInt[i];
        }

        Arrays.sort(tabInt);
        System.out.println("Najwieksza liczba to: ");
        System.out.println(tabInt[2]);
        System.out.println("Najmniejsza liczba to: ");
        System.out.println(tabInt[0]);
        System.out.println("Suma liczb to: " + suma);

    }
}