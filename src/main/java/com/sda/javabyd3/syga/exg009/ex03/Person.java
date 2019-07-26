package com.sda.javabyd3.syga.exg009.ex03;
//
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@ToString
public class Person {
    String name;
    String surname;
    String phoneNumber;
    String emailAddres;

    public Person() {
        this.name = "";
        this.surname = "";
        this.phoneNumber = "";
        this.emailAddres = "";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddres='" + emailAddres + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddres() {
        return emailAddres;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddres(String emailAddres) {
        this.emailAddres = emailAddres;
    }
}
