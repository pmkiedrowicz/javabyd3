package com.sda.javabyd3.toki.exg008regex.ex06;

import java.util.regex.Pattern;

public class EmailValidator {

    private boolean isItTrue = false;

    public boolean validate(String email) {

        Pattern pattern = Pattern.compile(
                "^([a-z0-9\\-\\+]{3,}" +
                        "[\\.]?){1,}" +
                        "[@]{1}" +
                        "[a-z]{1,}" +
                        "[.]{1}" +
                        "[a-z]{2,4}$");

        isItTrue = pattern.matcher(email).matches();

        return isItTrue;
    }
}
