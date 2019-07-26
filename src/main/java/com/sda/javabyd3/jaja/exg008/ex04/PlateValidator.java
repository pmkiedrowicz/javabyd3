package com.sda.javabyd3.jaja.exg008.ex04;

import java.util.regex.Pattern;

public class PlateValidator {

    public boolean validate(String plate) {
        Pattern pattern = Pattern.compile(
                "[A-Z]{2}"
                        + "\\d{3,5}"
                        + "[A-Z]{0,2}");
        boolean plateNumber = pattern.matcher(plate).matches();
        return plateNumber;
    }
}
