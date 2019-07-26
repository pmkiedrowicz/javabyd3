package com.sda.javabyd3.mizi.exg010.ex03;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class Main03Lambda {
    public static void main(String[] args) {
        List<Person> listOfPerson = new ArrayList <>(  );

        Person person1 = new Person("imie1", "nazwisko1");
        person1.addAccount( new BankAccount( "konto1imie1", 2000.0 ) );
        person1.addAccount( new BankAccount( "konto2imie1", 25000.0 ) );

        Person person2 = new Person("imie2", "nazwisko2");
        person2.addAccount( new BankAccount( "konto1imie2", 2000.0 ) );
        person2.addAccount( new BankAccount( "konto2imie2", 20000.0 ) );
        person2.addAccount( new BankAccount( "konto3imie2", 40000.0 ) );

        Person person3 = new Person("imie3", "nazwisko3");
        person3.addAccount( new BankAccount( "konto1imie3", 2500.0 ) );
        person3.addAccount( new BankAccount( "konto2imie3", 50000.0 ) );
        person3.addAccount( new BankAccount( "konto3imie3", 25000.0 ) );

        Person person4 = new Person("imie4", "nazwisko4");
        person4.addAccount( new BankAccount( "konto1imie4", 2600.0 ) );
        person4.addAccount( new BankAccount( "konto2imie4", 26000.0 ) );
        person4.addAccount( new BankAccount( "konto3imie4", 20600.0 ) );

        listOfPerson.add( person1 );
        listOfPerson.add( person2 );
        listOfPerson.add( person3 );
        listOfPerson.add( person4 );

        SortedMethod sortedMethod = new SortedMethod();
        sortedMethod.sort( listOfPerson );

    }
}
