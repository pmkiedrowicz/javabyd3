package com.sda.javabyd3.mabr.zadania008;

public class TelephoneValidator {

    public boolean validate(String telephone) {
        String regex = "[0-9]{3}-?\\s?[0-9]{3}-?\\s?[0-9]{3}$";

        return telephone.matches(regex);
    }
}


