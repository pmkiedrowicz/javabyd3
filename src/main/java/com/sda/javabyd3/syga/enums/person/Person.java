package com.sda.javabyd3.syga.enums.person;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Person {
    private String name;
    private String surname;
    private EyesColor eyesColor;
    private Sex sex;
}
