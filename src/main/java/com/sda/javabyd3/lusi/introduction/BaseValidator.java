package com.sda.javabyd3.lusi.introduction;


import com.sda.javabyd3.lusi.introduction.regularexpression.Validator;

import java.util.regex.Pattern;

import static com.sda.javabyd3.lusi.introduction.Utils.displayErrorOnConsole;
import static com.sda.javabyd3.lusi.introduction.Utils.displayTextOnConsole;


/**
 * Base validator class.
 */
public abstract class BaseValidator implements Validator {

    private final Pattern pattern;

    public BaseValidator(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public Boolean isValid(String value) {
        return pattern.matcher(value).matches();
    }

    public void validateAndDisplayMessage(String value, String possitive, String negative) {
        if (this.isValid(value)) {
            displayTextOnConsole(TextColor.ANSI_GREEN, possitive);
        } else {
            displayErrorOnConsole(negative);
        }
    }
}
