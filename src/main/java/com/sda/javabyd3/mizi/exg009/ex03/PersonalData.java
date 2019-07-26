package com.sda.javabyd3.mizi.exg009.ex03;

/**
 * Created by Michal Ziolecki.
 */
public class PersonalData {
    String name;
    String surname;
    String telefonNumber;
    String mailAddress;

    public PersonalData()
    {
        this.name = "";
        this.surname = "";
        this.telefonNumber = "";
        this.mailAddress = "";
    }

    public PersonalData(String name, String surname, String telefon, String mail){
        this.name = name;
        this.surname = surname;
        this.telefonNumber = telefon;
        this.mailAddress = mail;
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

    public String getTelefonNumber() {
        return telefonNumber;
    }

    public void setTelefonNumber(String telefonNumber) {
        this.telefonNumber = telefonNumber;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    @Override
    public String toString() {
        return "PersonalData{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", telefonNumber='" + telefonNumber + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                '}';
    }
}
