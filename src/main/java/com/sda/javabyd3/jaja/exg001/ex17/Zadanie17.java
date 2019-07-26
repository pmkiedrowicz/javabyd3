package com.sda.javabyd3.jaja.exg001.ex17;

public class Zadanie17 {
    String name;
    String surename;
    Integer salary;

    //tworzymy konctruktor
    public Zadanie17(String name, String surename, Integer salary) {
        this.name = name;
        this.surename = surename;
        this.salary = salary;
    }

    // towrzymy gettery i settery

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
