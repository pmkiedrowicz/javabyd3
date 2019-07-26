package com.sda.javabyd3.daol.exg010.ex03;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Person {
    String name;
    String lastName;
    List<BankAccount> accounts;
}

