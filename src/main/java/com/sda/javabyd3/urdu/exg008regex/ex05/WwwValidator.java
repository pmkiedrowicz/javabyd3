package com.sda.javabyd3.urdu.exg008regex.ex05;

import java.util.regex.Pattern;

public class WwwValidator {

    public boolean validate(String www){

        Pattern pattern = Pattern.compile("^www[.]{1}([a-zA-Z0-9]{2,}[.]{1})+[a-zA-Z]{2,4}$");
        boolean bool = pattern.matcher(www).matches();
        return bool;
    }
}
