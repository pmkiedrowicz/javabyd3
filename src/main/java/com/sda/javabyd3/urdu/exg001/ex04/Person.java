package com.sda.javabyd3.urdu.exg001.ex04;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Person {

    String name;
    String lastName;
    String pesel;

//    public Person(String name, String lastName, String pesel) {
//        this.name = name;
//        this.lastName = lastName;
//        this.pesel = pesel;
//    }

    @Override
    public String toString() {
        return String.format("Imie: %s, Nazwisko: %s, PESEL: %s ", name, lastName,pesel);
    }
}
