package com.sda.javabyd3.mabr.zadania003;

import java.util.Scanner;

public class MainPolishSings {

    public static void main(String[] args) {

        String input;
        Scanner read = new Scanner(System.in);
        input = read.nextLine();

        PolishSigns zad4 = new PolishSigns();
        System.out.println(zad4.Change(input));
    }
}
