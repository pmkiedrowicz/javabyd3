package com.sda.javabyd3.mizi.exg008.ex03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Michal Ziolecki.
 */
public class NameValidator {
    public boolean validate(String name)
    {
        boolean test ;
        Pattern pattern = Pattern.compile( "[A-ZŻŹĆĄŚĘŁÓŃ]{1}[a-zżźćńółęąś]+" );
        Matcher matcher = pattern.matcher( name);
        test = matcher.matches();
        return test;
    }
}
