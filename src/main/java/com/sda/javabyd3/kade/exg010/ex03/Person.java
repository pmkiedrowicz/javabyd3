package com.sda.javabyd3.kade.exg010.ex03;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String lastName;
    private List<BankAccount> accounts;

    public Person(String name, String lastName)
    {
        this.name = name;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
