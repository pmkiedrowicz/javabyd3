package com.sda.javabyd3.kawa.myKawaEnum.enumEx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {

    String imie;
    String nazwisko;

    private PersonsSex personsSex;
    private ColorOfAnEyes colorOfAnEyes;

    @Override
    public String toString() {
        return "Person{" +
                "imie = '" + imie + '\'' +
                ", nazwisko = '" + nazwisko + '\'' +
                ", personsSex = " + personsSex +
                ", colorOfAnEyes = " + colorOfAnEyes +
                '}';
    }
}
