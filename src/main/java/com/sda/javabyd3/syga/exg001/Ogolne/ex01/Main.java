package com.sda.javabyd3.syga.exg001.Ogolne.ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] tabNum = new int[3];
        int sum = 0;

        System.out.println("Podaj trzy liczby (każdą oddzielaj enterem): ");
        Scanner keybord = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            tabNum[i] = keybord.nextInt();
            sum += tabNum[i];
        }

        Arrays.sort(tabNum);
        System.out.println("Największa liczba to: " + tabNum[2]);
        System.out.println("Najmniejsza liczba to: " + tabNum[0]);
        System.out.println("Suma podanych liczb: " + sum);

    }
}
