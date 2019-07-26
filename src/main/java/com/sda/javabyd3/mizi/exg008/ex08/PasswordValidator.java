package com.sda.javabyd3.mizi.exg008.ex08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Michal Ziolecki.
 */
public class PasswordValidator {
    public boolean validate(String pass)
    {
        boolean test ;
        Pattern pattern = Pattern.compile( "^(?=.{8,16}$)(?=.*[A-Z].*[A-Z])(?=.*[a-z].*[a-z])(?=.*[^A-Za-z0-9])(?=.*[0-9]).*" );
        Matcher matcher = pattern.matcher( pass );
        test = matcher.matches();
        return test;
    }
}
