package com.sda.javabyd3.syga.exg008.ex03;

import java.util.regex.Pattern;

public class NameValidator {
    public NameValidator(){

    }

    public boolean nameValidator(String name){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        boolean isValid = pattern.matcher(name).matches();
        return isValid;
    }
}
