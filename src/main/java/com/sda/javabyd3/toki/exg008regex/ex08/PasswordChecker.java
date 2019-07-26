package com.sda.javabyd3.toki.exg008regex.ex08;

import java.util.regex.Pattern;

public class PasswordChecker {
    private boolean isItValid = false;
    private boolean smallLetter = false;
    private boolean bigLetter = false;
    private boolean number = false;
    private boolean nonWord = false;
    private int wordLength;
    private int min = 8;
    private int max = 16;

    public boolean validate(String password) {

        Pattern patternForSmallLetter = Pattern.compile("" +
                "^(.*([a-z]{1}).*){2,}$");

        Pattern patternForBigLetter = Pattern.compile("" +
                "^(.*([A-Z]{1}).*){2,}$");

        Pattern patternForNumber = Pattern.compile("" +
                "^(.*[0-9]{1,}.*)$");

        Pattern patternForNonWord = Pattern.compile("" +
                "^(.*[\\W]{1,}.*)$");

        smallLetter = patternForSmallLetter.matcher(password).matches();
        bigLetter = patternForBigLetter.matcher(password).matches();
        number = patternForNumber.matcher(password).matches();
        nonWord = patternForNonWord.matcher(password).matches();
        wordLength = password.length();

        if (smallLetter == true && bigLetter == true && number == true && nonWord == true && wordLength >= min && wordLength <= max) {
            System.out.println("Password is strong enough! " + password);
            isItValid = true;
        } else {
            System.out.println("Password is not strong enough! " + password);
            isItValid = false;
        }
        return isItValid;
    }
}
