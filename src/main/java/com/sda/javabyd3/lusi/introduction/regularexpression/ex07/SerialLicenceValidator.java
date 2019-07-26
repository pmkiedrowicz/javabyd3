package com.sda.javabyd3.lusi.introduction.regularexpression.ex07;

import com.sda.javabyd3.lusi.introduction.BaseValidator;

import java.util.regex.Pattern;

public class SerialLicenceValidator extends BaseValidator {

    public SerialLicenceValidator() {
        super(Pattern.compile("^[A-Z0-9]{5}-[A-Z0-9]{5}-[A-Z0-9]{5}-[A-Z0-9]{5}-[A-Z0-9]{5}$"));
    }
}
