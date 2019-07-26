package com.sda.javabyd3.jaja.exg010.ex03;

public class BankAccount {

    String name;
    Double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankAccount() {
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public BankAccount(String name, Double balance) {

        this.name = name;
        this.balance = balance;
    }
}
