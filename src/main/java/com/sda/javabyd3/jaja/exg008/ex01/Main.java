package com.sda.javabyd3.jaja.exg008.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TelephoneValidator telephoneValidator = new TelephoneValidator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer telefonu: ");
        String number = scanner.nextLine();
        Boolean numerValid = telephoneValidator.validate(number);
        System.out.println(String.format("Podany numer telefonu %s%s jest poprawny.", number,numerValid ? " " : " nie" ));
    }
}