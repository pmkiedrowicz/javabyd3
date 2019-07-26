package com.sda.javabyd3.syga.exg001.Ogolne.ex04;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Person {

    String imie;
    String nazwisko;
    long pesel;



    @Override
    public String toString() {
        return "Imie: " + String.format("%s", imie) + "\n" +
                "Nazwisko: " + String.format("%s", nazwisko) + "\n" +
                "PESEL: " + String.format("%s", pesel);
    }
}
