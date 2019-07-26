package com.sda.javabyd3.mizi.exg008.ex07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Michal Ziolecki.
 */
public class IPValidator {
    public boolean validate(String ip)
    {
        //.compile( "([1]?[0-9]?[0-9]{1})|([2]{1}[0-5]{1}[0-5]{1})");
        boolean test ;
        Pattern pattern = Pattern
                .compile( "(([1]?[0-9]?[0-9]{1})|([2]{1}[0-5]{1}[0-5]{1}))[\\.]{1}"+
                "(([1]?[0-9]?[0-9]{1})|([2]{1}[0-5]{1}[0-5]{1}))[\\.]{1}" +
                "(([1]?[0-9]?[0-9]{1})|([2]{1}[0-5]{1}[0-5]{1}))[\\.]{1}" +
                "(([1]?[0-9]?[0-9]{1})|([2]{1}[0-5]{1}[0-5]{1}))");
        Matcher matcher = pattern.matcher( ip );
        test = matcher.matches();
        return test;
    }
}
