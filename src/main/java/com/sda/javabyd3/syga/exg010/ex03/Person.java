package com.sda.javabyd3.syga.exg010.ex03;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    BankAccount bankAccount = new BankAccount();
    String name;
    String lastName;
    List<BankAccount> accounts;
}
