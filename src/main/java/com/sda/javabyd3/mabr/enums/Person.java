package com.sda.javabyd3.mabr.enums;

public class Person {
    String name;
    String surname;
    EyeColor eyescolor;
    Gender gender;

    public Person(String name, String surname, EyeColor eyescolor, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.eyescolor = eyescolor;
        this.gender = gender;
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

    public EyeColor getEyescolor() {
        return eyescolor;
    }

    public void setEyescolor(EyeColor eyescolor) {
        this.eyescolor = eyescolor;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", eyescolor='" + eyescolor + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
