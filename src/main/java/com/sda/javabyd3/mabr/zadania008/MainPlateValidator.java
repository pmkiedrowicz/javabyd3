package com.sda.javabyd3.mabr.zadania008;

import java.util.Scanner;

public class MainPlateValidator {
    public static void main(String[] args) {
        String plate;
        Scanner read = new Scanner(System.in);
        plate = read.nextLine();
        PlateValidator plateValidator = new PlateValidator();

        if (plateValidator.validate(plate)) {
            System.out.println(plate + " is correct plate");
        } else {
            System.out.println(plate + " is not a correct plate");
        }
    }
}
