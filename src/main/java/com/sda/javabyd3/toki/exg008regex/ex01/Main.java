package com.sda.javabyd3.toki.exg008regex.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String telephone = scanner.nextLine();
        TelephoneValidator telephoneValidator = new TelephoneValidator();

        System.out.println(telephoneValidator.validate(telephone));
        scanner.close();
    }
}
