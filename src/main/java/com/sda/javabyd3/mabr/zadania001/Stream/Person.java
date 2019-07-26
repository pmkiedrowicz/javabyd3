package com.sda.javabyd3.mabr.zadania001.Stream;

public class Person {
    private String name;
    private String surname;
    private Integer salary;

    public Person() {
        this.name = null;
        this.surname = null;
        this.salary = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
