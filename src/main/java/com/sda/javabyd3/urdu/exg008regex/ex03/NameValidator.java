package com.sda.javabyd3.urdu.exg008regex.ex03;

import java.util.regex.Pattern;

public class NameValidator {

    public boolean isNameCorrect(String name){

        Pattern pattern = Pattern.compile("^[A-ZŚŻŁ]{1}[a-złśćąęóżź]+$");
        boolean bool = pattern.matcher(name).matches();
        return  bool;
    }
}
