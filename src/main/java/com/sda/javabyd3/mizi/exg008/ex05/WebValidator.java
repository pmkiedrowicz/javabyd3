package com.sda.javabyd3.mizi.exg008.ex05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Michal Ziolecki.
 */
public class WebValidator {
    public boolean validate(String www)
    {
        boolean test ;
        Pattern pattern = Pattern.compile( "([w]{3}\\.[a-z0-9]+\\.[a-z]{2})" );
        Matcher matcher = pattern.matcher( www );
        test = matcher.matches();
        return test;
    }
}
