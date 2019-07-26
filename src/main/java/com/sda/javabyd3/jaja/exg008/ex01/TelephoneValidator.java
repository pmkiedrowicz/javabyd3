package com.sda.javabyd3.jaja.exg008.ex01;

import java.util.regex.Pattern;

public class TelephoneValidator {

    public boolean validate(String telephone){
        Pattern pattern = Pattern.compile(
                        "\\d{3}"
                        + " ?"
                        +"-?"
                        + "\\d{3}"
                        + " ?"
                        +"-?"
                        +"\\d{3}");
        boolean telephoneNumber = pattern.matcher(telephone).matches();
        return telephoneNumber;
    }
}
