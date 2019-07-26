package com.sda.javabyd3.jaja.exg008.ex03;

import java.util.regex.Pattern;

public class NameValidator {

    public boolean validate(String name){
        Pattern pattern = Pattern.compile("[A-ZŁŻ]{1}" + "[a-ząęłśóńźżć]*");

        boolean userName = pattern.matcher(name).matches();
        return userName;
    }
}
