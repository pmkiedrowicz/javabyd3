package com.sda.javabyd3.mabr.zadania008;

public class NameValidator {
    public boolean validate(String name) {
        String regex = "[A-ZŁŚŻ][a-ząćęłóśżź]+";

        return name.matches(regex);
    }
}
