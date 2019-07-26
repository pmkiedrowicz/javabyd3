package com.sda.javabyd3.mizi.exg010.ex03;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class Person {
    private String name;
    private String lastName;
    private List<BankAccount> bankAccountList;

    public Person(String name, String lastName)
    {
        this.name = name;
        this.lastName = lastName;
        this.bankAccountList = new ArrayList <>(  );
    }

    public void addAccount(BankAccount account){
        bankAccountList.add( account );
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

    public List <BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void setBankAccountList(List <BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bankAccountList=" + bankAccountList.size() +
                '}';
    }
}
