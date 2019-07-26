package com.sda.javabyd3.mabr.zadania008;

public class WwwValidator {
    public boolean validate(String www) {
        String regex = "(www.)[a-z]+.[a-z]+";

        return www.matches(regex);
    }
}
