package com.sda.javabyd3.migr.enums.ex02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Person {
    String imie;
    String nazwisko;
    private EyeColor eyeColor;
    private Gender gender;

    @Override
    public String toString() {
        return "Person{" +
                "imie = '" + imie + '\'' +
                ", nazwisko = '" + nazwisko + '\'' +
                ", eyeColor = " + eyeColor +
                ", gender = " + gender +
                '}';
    }
}
