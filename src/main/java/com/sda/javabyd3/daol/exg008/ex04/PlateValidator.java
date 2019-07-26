package com.sda.javabyd3.daol.exg008.ex04;

import java.util.regex.Pattern;

public class PlateValidator {
    public Boolean validate(String plate) {
        Pattern pattern = Pattern.compile("[A-Z]{2}+\\d{5}||[A-Z]{2}+\\d{4}+[A-Z]{1}||[A-Z]{2}+\\d{3}+[A-Z]{2}");
        Boolean bool = pattern.matcher(plate).matches();
        return bool;
    }
}
