package com.sda.javabyd3.urdu.exg001.collections;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Person {

    String name;
    String lastName;


//    public Person(String name, String lastName, String pesel) {
//        this.name = name;
//        this.lastName = lastName;
//        this.pesel = pesel;
//    }

    @Override
    public String toString() {
        return String.format("Imie: %s, Nazwisko: %s ", name, lastName);
    }
}
