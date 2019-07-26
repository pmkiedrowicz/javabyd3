package com.sda.javabyd3.kawa.exg001.ogolne.ex04;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Person {

    String imie;
    String nazwisko;
    long pesel;

    @Override
    public String toString() {
        return String.format("Imie: %s, Nazwisko: %s, PESEL: %s", imie,nazwisko,pesel);
    }

// to samo co wyzej tylko brzydko
//    @Override
//    public String toString() {
//        return "Person{" +
//                "imie='" + imie + '\'' +
//                ", nazwisko='" + nazwisko + '\'' +
//                ", pesel=" + pesel +
//                '}';
//    }
}
