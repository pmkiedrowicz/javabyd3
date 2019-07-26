package com.sda.javabyd3.urdu.exg008regex.ex01;
/**
 * Program sprawdzający poprawność formatu numeru telefonu:
 * Poprawne formaty to: 888888888, 888 888 888, 888-888-888
 */

import java.util.regex.Pattern;

public class Validator {

    public boolean checkPhoneNumber(String telephone){
       // Pattern p = Pattern.compile("\\d{9}|(?:\\d{3}-){2}\\d{3}|(?:\\d{3} ){2}\\d{3}"); //inny zapis
        Pattern pattern = Pattern.compile("^\\d{9}$|"
                +"^[0-9]{3}[ ][0-9]{3}[ ][0-9]{3}$|"
                + "^[0-9]{3}[-][0-9]{3}[-][0-9]{3}$");
        Boolean bool =pattern.matcher(telephone).matches();
        return bool;
    }

}
