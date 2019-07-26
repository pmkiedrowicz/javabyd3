package com.sda.javabyd3.mabr.zadania008;

public class EmailValidator {
    public boolean validate(String email) {
        String regex = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";

        return email.matches(regex);
    }
}
