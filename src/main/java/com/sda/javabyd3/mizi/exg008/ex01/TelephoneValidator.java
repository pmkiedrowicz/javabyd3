package com.sda.javabyd3.mizi.exg008.ex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Michal Ziolecki.
 */
public class TelephoneValidator {
    public boolean validate(String telephone){
        boolean test ;
        Pattern pattern = Pattern.compile( "([0-9]{9})|([0-9]{3}-[0-9]{3}-[0-9]{3})|([0-9]{3}\\s[0-9]{3}\\s[0-9]{3})" );
        Matcher matcher = pattern.matcher( telephone );
        test = matcher.matches();
        return test;
    }
}
