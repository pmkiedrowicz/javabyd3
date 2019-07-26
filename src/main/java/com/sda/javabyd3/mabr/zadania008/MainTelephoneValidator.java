package com.sda.javabyd3.mabr.zadania008;

import java.util.Scanner;

public class MainTelephoneValidator {

    public static void main(String[] args) {

        String telephone;
        Scanner read = new Scanner(System.in);
        telephone = read.nextLine();
        TelephoneValidator telephoneValidator = new TelephoneValidator();

        if (telephoneValidator.validate(telephone)) {
            System.out.println(telephone + " is correct number");
        } else {
            System.out.println(telephone + " is not a correct number");
        }
    }
}

