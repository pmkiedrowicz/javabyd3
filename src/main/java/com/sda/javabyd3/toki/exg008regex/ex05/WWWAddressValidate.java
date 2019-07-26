package com.sda.javabyd3.toki.exg008regex.ex05;

import java.util.regex.Pattern;

public class WWWAddressValidate {
    public WWWAddressValidate(){
    }

    public boolean validate(String www){

        Pattern pattern=Pattern.compile(
                "^[w]{3}[.]{1}" +
                "[a-z0-9]{1,}[.]{1}" +
                "([a-z]{2,4}||(([a-z0-9]{1,}[.]{1}){1,}[a-z]{2,4}))$");



        boolean isItValid=pattern.matcher(www).matches();
    return isItValid;
    }
}
