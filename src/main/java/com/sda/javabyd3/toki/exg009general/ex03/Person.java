package com.sda.javabyd3.toki.exg009general.ex03;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {

    String name;
    String surname;
    String tel;
    String email;

    public Person() {
        this.name = "";
        this.surname = "";
        this.tel = "";
        this.email = "";
    }
}
