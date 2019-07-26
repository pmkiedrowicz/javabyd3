package com.sda.javabyd3.syga.exg008.ex01_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a phone number: ");
        String phoneNumber = scanner.nextLine();
        TelephoneValidator telephoneValidator = new TelephoneValidator();
        System.out.println(telephoneValidator.validate(phoneNumber));
        scanner.close();
    }
}
