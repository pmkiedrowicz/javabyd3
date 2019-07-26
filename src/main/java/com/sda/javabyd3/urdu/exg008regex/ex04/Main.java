package com.sda.javabyd3.urdu.exg008regex.ex04;

import com.sda.javabyd3.urdu.exg008regex.ex03.NameValidator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PlateValidator plateValidator = new PlateValidator();
        Scanner scanNumber = new Scanner(System.in);

        System.out.println("Podaj numer tablicy rejestracyjnej");
        String number = scanNumber.next();

        if(plateValidator.isPlateCorrect(number)){

            System.out.println("Numer jest poprawny");
        }
        else {
            System.out.println("Numer jest niepoprawny.");
        }

    }
}
