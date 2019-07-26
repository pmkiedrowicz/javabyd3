package com.sda.javabyd3.lusi.introduction.regularexpression.ex06;

import com.sda.javabyd3.lusi.introduction.BaseValidator;

import java.util.regex.Pattern;

public class SerialNumberValidator extends BaseValidator

{
    public SerialNumberValidator() {
        super(Pattern.compile("^[A-Z]{3}\\d{5}[a-z][A-Z]$"));
    }
}
