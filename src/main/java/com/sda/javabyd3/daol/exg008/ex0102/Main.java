package com.sda.javabyd3.daol.exg008.ex0102;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer telefonu: ");
        String telephone = scanner.nextLine();

        TelephoneValidator telephoneValidator = new TelephoneValidator();
        Boolean telephoneIsValid = telephoneValidator.validate(telephone);
        String txt;
        if (telephoneIsValid) {
            txt = "";
        } else {
            txt = " nie";
        }
        System.out.println(String.format("Podany numer telefonu%s jest poprawny.", txt));
    }
}
