package com.sda.javabyd3.mizi.exg010.ex03;

/**
 * Created by Michal Ziolecki.
 */
public class BankAccount {

    private String name;
    private Double balance;

    public BankAccount(String name, Double balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
