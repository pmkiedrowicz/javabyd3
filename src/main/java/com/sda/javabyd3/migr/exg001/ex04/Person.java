package com.sda.javabyd3.migr.exg001.ex04;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Person {
    String imie;
    String nazwisko;
    int pesel;


    @Override
    public String toString() {
        return
                String.format("Imie:​ ​ %s,​ ​ Nazwisko: %s,​ ​ PESEL:​ ​ %s", imie, nazwisko, pesel);

    }
}
