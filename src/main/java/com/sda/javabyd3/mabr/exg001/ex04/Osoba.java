package com.sda.javabyd3.mabr.exg001.ex04;

public class Osoba {
    private String firstName;
    private String lastName;
    private int pesel;

    public Osoba(String firstName, String lastName, int pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }


    @Override
    public String toString() {
        return String.format("Imie: %s, Nazwisko: %s, PESEL: %s", firstName, lastName, pesel);
    }

}
