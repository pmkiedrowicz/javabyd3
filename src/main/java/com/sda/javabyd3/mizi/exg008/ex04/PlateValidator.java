package com.sda.javabyd3.mizi.exg008.ex04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Michal Ziolecki.
 */
public class PlateValidator {
    public boolean validate(String plate)
    {
        boolean test ;
        Pattern pattern = Pattern.compile( "([A-Z]{2})(([0-9]{5})|([0-9]{4}[A-Z]{1})|([0-9]{3}[A-Z]{2}))" );
        Matcher matcher = pattern.matcher( plate );
        test = matcher.matches();
        return test;
    }
}
