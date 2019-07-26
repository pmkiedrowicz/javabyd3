package com.sda.javabyd3.jaja.exg008.ex05;

import java.util.regex.Pattern;

public class WebAdressValidator {

    public boolean validate(String www){
        Pattern pattern = Pattern.compile(
                "[w]{3}"
                        + "\\."
                        + "[a-z]+\\d*"
                        + "\\."
                        + "[a-z]{2,3}");
        boolean validWebAdress = pattern.matcher(www).matches();
        return validWebAdress;
    }
}
