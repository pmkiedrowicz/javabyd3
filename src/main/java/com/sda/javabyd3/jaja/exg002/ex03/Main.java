package com.sda.javabyd3.jaja.exg002.ex03;

import java.util.Scanner;

public class Main {

        public static void main (String[]args){

            Zadanie3 zadanie3 = new Zadanie3();
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj przykładową liczbę: ");
            int key = scanner.nextInt();
            System.out.println(zadanie3.contains(numbers, key));
        }
    }

