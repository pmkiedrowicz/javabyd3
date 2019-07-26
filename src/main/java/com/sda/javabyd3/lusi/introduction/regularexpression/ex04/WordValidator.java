package com.sda.javabyd3.lusi.introduction.regularexpression.ex04;

import com.sda.javabyd3.lusi.introduction.BaseValidator;

import java.util.regex.Pattern;

public class WordValidator extends BaseValidator {

    public WordValidator() {
        super(Pattern.compile(".*ala.*"));
    }
}
