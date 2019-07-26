package com.sda.javabyd3.mabr.zadania008;

public class PlateValidator {
    public boolean validate(String plate) {
        String regex = "[A-Z]{2}[0-9][0-9][0-9][0-9A-Z][0-9A-Z]";

        return plate.matches(regex);
    }
}
