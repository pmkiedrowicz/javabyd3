package com.sda.javabyd3.mizi.exg001.Ogolne;

/**
 * Created by Michal Ziolecki.
 */
public class Person {
    private String name;
    private String surname;
    private String personID;

    public Person()
    {
        this.name = null;
        this.surname = null;
        this.personID = null;
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

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    @Override
    public String toString() {
        return
                "Imie: " + name + ',' +
                " Nazwisko: " + surname + ',' +
                " PESEL: " + personID;
    }
}
