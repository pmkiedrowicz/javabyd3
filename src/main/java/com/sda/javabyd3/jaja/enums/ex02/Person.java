package com.sda.javabyd3.jaja.enums.ex02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {

    private String name;
    private String lastname;
    private EyeColor eyeColor;
    private Sex sex;

    @Override
    public String toString() {
        return name +" "+ lastname +" "+ eyeColor +" "+ sex;
    }
}

