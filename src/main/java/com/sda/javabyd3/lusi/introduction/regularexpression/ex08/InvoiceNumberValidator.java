package com.sda.javabyd3.lusi.introduction.regularexpression.ex08;

import com.sda.javabyd3.lusi.introduction.BaseValidator;

import java.util.regex.Pattern;

public class InvoiceNumberValidator extends BaseValidator {
    public InvoiceNumberValidator() {
        super(Pattern.compile("^FV/\\d{1,4}/\\d{2}/\\d{4}$"));
    }
}
