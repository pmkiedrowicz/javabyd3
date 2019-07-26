package com.sda.javabyd3.urdu.exEnum.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Person {

   private String name;
   private String lastName;
    Sex sex;
    EyeColor eyeColor;

    @Override
    public String toString() {
        return name +" " + lastName +" to " + sex.getShortSex() + " o kolorze oczu: " + eyeColor;
    }
}
