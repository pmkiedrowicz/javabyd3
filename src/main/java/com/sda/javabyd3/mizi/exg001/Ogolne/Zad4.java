package com.sda.javabyd3.mizi.exg001.Ogolne;

/**
 * Created by Michal Ziolecki.
 */
public class Zad4 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName( "Michal" );
        person.setSurname( "Ziolecki" );
        person.setPersonID("111111111");

        System.out.println(person.toString());
    }
}
