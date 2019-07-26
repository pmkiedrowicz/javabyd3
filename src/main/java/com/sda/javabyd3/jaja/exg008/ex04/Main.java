package com.sda.javabyd3.jaja.exg008.ex04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PlateValidator plateValidator = new PlateValidator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tablica rejestracyjna: ");
        String plate = scanner.nextLine();
        boolean validPlate = plateValidator.validate(plate);
        System.out.println(String.format("Podany numer %s%s jest poprawny", plate, validPlate ? "" : " nie"));
    }
}
