package com.sda.javabyd3.syga.exg008.ex05;

import java.util.regex.Pattern;

public class AdressValidate {
    public AdressValidate(){

    }
    public boolean validate(String www){
        Pattern pattern = Pattern.compile("^[w]{3}[.]{1}" +
                "[a-z0-9]{1,}[.]{1}" +
                "([a-z]{2,4}||([a-z0-9]{1,}[.]{1}[a-z]{2,4}))$");

        boolean isValid = pattern.matcher(www).matches();
        return isValid;
    }
}
