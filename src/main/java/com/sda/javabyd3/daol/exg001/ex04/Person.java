package com.sda.javabyd3.daol.exg001.ex04;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Person {
    String name;
    String surname;
    String pesel;

    @Override
    public String toString() {
        return (String.format("Imię: %s\nNazwisko: %s\nPesel: %s", name, surname, pesel ));
    }
}
