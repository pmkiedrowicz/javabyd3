package com.sda.javabyd3.toki.exg008regex.ex03;

import java.util.regex.Pattern;

public class NameValidator {
    public NameValidator() {
    }

    public boolean validate(String name) {
        Pattern pattern = Pattern.compile("^[A-Z,Ą,Ć,Ę,Ł,Ń,Ó,Ś,Ź,Ż]{1}" +
                "[a-z,ą,ć,ę,ł,ń,ó,ś,ź,ż]{1,}$");

        Boolean isItValid = pattern.matcher(name).matches();

        return isItValid;
    }
}
