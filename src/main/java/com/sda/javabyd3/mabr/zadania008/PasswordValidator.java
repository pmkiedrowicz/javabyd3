package com.sda.javabyd3.mabr.zadania008;

public class PasswordValidator {
    public boolean validate(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-z]{2})(?=.*[A-Z]{2})(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$";

        return password.matches(regex);
    }
}
