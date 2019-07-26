package com.sda.javabyd3.syga.exg008.ex04;

import java.util.regex.Pattern;

public class PlateValidator {
    public PlateValidator(){

    }

    public boolean validator (String plate){

        Pattern pattern = Pattern.compile("^[A-Z]{2}" +
                "([0-9]{5}||[0-9]{4}[A-Z]{1}||[0-9]{3}[A-Z]{2})$");
        boolean isValid = pattern.matcher(plate).matches();

        return isValid;
    }
}
