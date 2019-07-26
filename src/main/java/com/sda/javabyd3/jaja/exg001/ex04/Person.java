package com.sda.javabyd3.jaja.exg001.ex04;

public class Person {
    String name;
    String surename;
    String pesel;

    public Person(String name, String surename, String pesel) {
        this.name = name;
        this.surename = surename;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return (String.format("Imie: %s, Nazwisko: %s, PESEL: %s ", name, surename, pesel));
    }
}

