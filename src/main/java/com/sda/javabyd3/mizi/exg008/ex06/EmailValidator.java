package com.sda.javabyd3.mizi.exg008.ex06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Michal Ziolecki.
 */
public class EmailValidator {
    public boolean validate(String mail)
    {
        boolean test ;
        Pattern pattern = Pattern.compile( "([a-z0-9\\-\\+]{3,}[\\.]?){1,}[@]{1}[a-z]{2,10}[\\.]{1}[a-z]{2,3}" );
        Matcher matcher = pattern.matcher( mail );
        test = matcher.matches();
        return test;
    }
}
