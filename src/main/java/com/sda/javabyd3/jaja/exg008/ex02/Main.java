package com.sda.javabyd3.jaja.exg008.ex02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TelephoneValidatorWithAreaCode telephoneValidatorWithAreaCode = new TelephoneValidatorWithAreaCode();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer telefonu: ");
        String number = scanner.nextLine();

        Boolean validNumber = telephoneValidatorWithAreaCode.validator(number);
        System.out.println(String.format("Podany numer telefonu %s%s jest poprawny.", number, validNumber ? " " : " nie"));
    }
}
