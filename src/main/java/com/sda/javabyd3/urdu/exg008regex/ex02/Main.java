package com.sda.javabyd3.urdu.exg008regex.ex02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ValidatorCountry vc= new ValidatorCountry();
        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Podaj numer telefonu: ");
        String number= scanNumber.nextLine();

        if(vc.checkPhoneNumber(number)){

            System.out.println("Podano numer telefonu w dobyrm formacie");
        }
        else {
            System.out.println("Podanu numer w złym formacie");
        }
    }
}
