package com.sda.javabyd3.jaja.exg010.ex03;

import java.util.List;

public class Person {

    String name;
    String lastName;
    List<BankAccount> accounts;

    public Person() {
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public Person(String name, String lastName, List<BankAccount> accounts) {

        this.name = name;
        this.lastName = lastName;
        this.accounts = accounts;
    }
}
