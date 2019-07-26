package com.sda.javabyd3.daol.exg008.ex04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znaki z tablicy rejestracyjnej: ");
        String plate = scanner.nextLine();

        PlateValidator plateValidator = new PlateValidator();
        Boolean plateIsValid = plateValidator.validate(plate);
        String txt;
        if (plateIsValid) {
            txt = "";
        }
        else {
        txt = "nie";
        }
        System.out.println(String.format("Podana rejestracja %s %s jest poprawna.", plate, txt));
    }
}
