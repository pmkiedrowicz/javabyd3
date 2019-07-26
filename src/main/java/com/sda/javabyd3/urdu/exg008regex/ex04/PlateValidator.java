package com.sda.javabyd3.urdu.exg008regex.ex04;

import java.util.regex.Pattern;

public class PlateValidator {

    public boolean isPlateCorrect(String number){

        Pattern pattern = Pattern.compile("^[A-Z]{2}[0-9]{5}$|" +
                "^[A-Z]{2}[0-9]{4}[A-Z]{1}$|" +
                "^[A-Z]{2}[0-9]{3}[A-Z]{2}$");
        boolean bool = pattern.matcher(number).matches();
        return  bool;
    }
}
