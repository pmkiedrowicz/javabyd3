package com.sda.javabyd3.toki.exg008regex.ex07;

import java.util.regex.Pattern;

public class IPChecker {
    private boolean isItTrue = false;

    public boolean validate(String address) {

        Pattern pattern = Pattern.compile(
                "^\\d{2,3}" +
                        "[.]{1}" +
                        "\\d{2,3}" +
                        "[.]{1}" +
                        "\\d{1,2}" +
                        "[.]{1}" +
                        "\\d{1,2}$");

        isItTrue = pattern.matcher(address).matches();
        return isItTrue;
    }

    private boolean isItRealTrue = false;

    public boolean validateInRealRange(String address) {
        Pattern pattern = Pattern.compile(
                "^((?<!\\d)(?:[1-9]?\\d|1\\d\\d|2(?:[0-4]\\d|5[0-5]))(?!\\d)[.]{1}){3}" +
                        "((?<!\\d)(?:[1-9]?\\d|1\\d\\d|2(?:[0-4]\\d|5[0-5]))(?!\\d))$");

        isItRealTrue = pattern.matcher(address).matches();
        return isItRealTrue;
    }
}
