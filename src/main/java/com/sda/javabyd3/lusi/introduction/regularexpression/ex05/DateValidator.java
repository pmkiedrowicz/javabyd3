package com.sda.javabyd3.lusi.introduction.regularexpression.ex05;

import com.sda.javabyd3.lusi.introduction.BaseValidator;

import java.util.regex.Pattern;

public class DateValidator extends BaseValidator {

    public DateValidator() {
        super(Pattern.compile("^\\d{2}\\.\\d{2}\\.\\d{4}r\\.$"));
    }
}
