package com.sda.javabyd3.mabr.zadania008;

import java.util.Scanner;

public class MainTelephoneValidatorCountry {

    public static void main(String[] args) {

        String telephone;
        Scanner read = new Scanner(System.in);
        telephone = read.nextLine();
        TelephoneValidatorCountry telephoneValidatorCountry = new TelephoneValidatorCountry();

        if (telephoneValidatorCountry.validate(telephone)) {
            System.out.println(telephone + " is correct number");
        } else {
            System.out.println(telephone + " is not a correct number");
        }
    }
}

