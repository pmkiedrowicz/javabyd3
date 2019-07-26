package com.sda.javabyd3.mizi.exg009.ex03;


import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class ContactCodeCreator {

    Scanner scanner;
    PersonalData person;

    public ContactCodeCreator(){
        scanner = new Scanner( System.in );
    }

    public PersonalData contactCreator(){
        person = new PersonalData(  );
        System.out.println("Podaj imie: ");
        person.setName( scanner.nextLine() );
        System.out.println("Podaj nazwisko: ");
        person.setSurname( scanner.nextLine() );
        System.out.println("Podaj numer telefonu: ");
        person.setTelefonNumber( scanner.nextLine() );
        System.out.println("Podaj mail: ");
        person.setMailAddress(scanner.nextLine());
        return person;
    }
}
