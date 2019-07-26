package com.sda.javabyd3.daol.exg008.ex03;

import java.util.regex.Pattern;

public class NameValidator {

    public Boolean validate(String name) {
        Pattern pattern = Pattern.compile("[A-Z]{1}+[a-z]+");
        Boolean bool = pattern.matcher(name).matches();
        return bool;
    }
}
