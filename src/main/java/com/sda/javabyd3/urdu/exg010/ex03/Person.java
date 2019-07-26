package com.sda.javabyd3.urdu.exg010.ex03;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Person {

    private String name;
    private String lastName;
    private List<BankAccount> accounts;

    @Override
    public String toString() {
        return " Imię= "+name +", nazwisko= " + lastName +
                " liczba kont: " + accounts.size()+ "\n";
    }
}
