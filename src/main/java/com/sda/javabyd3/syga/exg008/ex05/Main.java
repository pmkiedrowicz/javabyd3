package com.sda.javabyd3.syga.exg008.ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdressValidate adressValidate = new AdressValidate();
        System.out.println("Podaj adres strony www: ");
        String adress = scanner.nextLine();
        System.out.println(adressValidate.validate(adress));
        scanner.close();
    }
}
