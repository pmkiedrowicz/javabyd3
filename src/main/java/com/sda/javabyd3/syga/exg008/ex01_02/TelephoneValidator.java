package com.sda.javabyd3.syga.exg008.ex01_02;

import java.util.regex.Pattern;

public class TelephoneValidator {
    public TelephoneValidator(){

    }

    public boolean validate(String telephone){
        Pattern pattern = Pattern.compile("^[0-9]{9}||[0-9]{3}[ ]{1}[0-9]{3}[ ]{1}[0-9]{3}||[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{3}||" +
                "[+]{1}[0-9]{2}[0-9]{9}||[+]{1}[0-9]{2}[ ][0-9]{3}[ ]{1}[0-9]{3}[ ]{1}[0-9]{3}||[+]{1}[0-9]{2}[ ][0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{3}");
        boolean isValid = pattern.matcher(telephone).matches();

        return isValid;
    }
}
