package com.sda.javabyd3.syga.exg008.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nr tablicy rejestracyjnej: ");
        String plate = scanner.nextLine();
        PlateValidator plateValidator = new PlateValidator();
        System.out.println(plateValidator.validator(plate));
        scanner.close();

    }
}