package com.sda.javabyd3.jaja.exg008.ex02;

import java.util.regex.Pattern;

public class TelephoneValidatorWithAreaCode {

    public boolean validator(String telephone) {
        Pattern pattern = Pattern.compile(
                        "((\\+\\d{2}))?"
                        + "\\d{3}"
                        + " ?"
                        + "-?"
                        + "\\d{3}"
                        + " ?"
                        + "-?"
                        + "\\d{3}");
        boolean telephoneNumber = pattern.matcher(telephone).matches();
        return telephoneNumber;
    }
}
