package com.sda.javabyd3.toki.exg008regex.ex02;

import java.util.regex.Pattern;

public class TelephoneValidator {
    public TelephoneValidator() {
    }

    public boolean validate(String telephone) {

        Pattern pattern = Pattern.compile(
                        "^([+][0-9]{2})?[0-9]{9}$|" +
                        "^([+][0-9]{2})?([0-9]{3}[ ]){2}[0-9]{3}$|" +
                        "^([+][0-9]{2})?([0-9]{3}[-]){2}[0-9]{3}$");
        Boolean isItValid = pattern.matcher(telephone).matches();

        return isItValid;
    }
}
