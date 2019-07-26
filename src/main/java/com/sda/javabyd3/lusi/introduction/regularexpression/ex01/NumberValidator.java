package com.sda.javabyd3.lusi.introduction.regularexpression.ex01;


import com.sda.javabyd3.lusi.introduction.regularexpression.Validator;

import java.util.regex.Pattern;

/**
 * Number validator. It uses regular expression to check if provided text is string.
 */
public class NumberValidator implements Validator {
    private final Pattern patter = Pattern.compile("^\\d+$");

    public Boolean isEven(String number) {
        return Integer.parseInt(number) % 2 == 0;
    }

    public Boolean isOdd(String number) {
        return Integer.parseInt(number) % 2 != 0;
    }

    @Override
    public Boolean isValid(String value) {
        return patter.matcher(value).matches();
    }
}
