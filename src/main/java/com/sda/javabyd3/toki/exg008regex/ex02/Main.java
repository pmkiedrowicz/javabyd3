package com.sda.javabyd3.toki.exg008regex.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a telephone number: ");
        String telephone = scanner.nextLine();
        TelephoneValidator telephoneValidator = new TelephoneValidator();

        System.out.println(telephoneValidator.validate(telephone));
        scanner.close();
    }
}
