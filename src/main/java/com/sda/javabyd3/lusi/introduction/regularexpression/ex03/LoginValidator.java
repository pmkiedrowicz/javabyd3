package com.sda.javabyd3.lusi.introduction.regularexpression.ex03;

import com.sda.javabyd3.lusi.introduction.regularexpression.Validator;

import java.util.regex.Pattern;

public class LoginValidator implements Validator {
    private final Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{8,16}$");

    @Override
    public Boolean isValid(String value) {
        return pattern.matcher(value).matches();
    }
}
