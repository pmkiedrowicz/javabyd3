package com.sda.javabyd3.daol.exg008.ex0102;

import java.util.regex.Pattern;

public class TelephoneValidator {

    public Boolean validate(String telphone) {
        Pattern pattern = Pattern.compile(".48+[0-9]{9}||[0-9]{9}||.48+[0-9]{3}+\\s+[0-9]{3}+\\s+[0-9]{3}||[0-9]{3}+\\s+[0-9]{3}+\\s+[0-9]{3}||.48+[0-9]{3}-[0-9]{3}-[0-9]{3}||[0-9]{3}-[0-9]{3}-[0-9]{3}");
        Boolean bool = pattern.matcher(telphone).matches();
        return bool;
    }
}
