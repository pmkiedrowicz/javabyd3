package com.sda.javabyd3.syga.exg001.Ogolne.ex04;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.imie = "Jan";
        person.nazwisko = "Kowalski";
        person.pesel = 12345678901L;
        System.out.println(person.toString()+"\n");

        person.imie = "Arek";
        person.nazwisko = "Czarek";
        person.pesel = 12345678901L;
        System.out.println(person.toString());

    }
}
