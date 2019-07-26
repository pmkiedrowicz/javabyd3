package com.sda.javabyd3.kawa.exg010.ex03;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Person {

    String name;
    String lastName;
    List<BankAcc> accounts;
}
