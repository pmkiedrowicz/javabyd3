package com.sda.javabyd3.mizi.exg010.ex03;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Michal Ziolecki.
 */
public class SortedMethodTest {

    public SortedMethodTest(){

    }


    @Test
    public void sort() throws Exception {

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

        List<Person> listOfPersonToTest = new ArrayList<>(  );
        listOfPersonToTest.add( person1 );
        listOfPersonToTest.add( person2 );
        listOfPersonToTest.add( person3 );
        listOfPersonToTest.add( person4 );

        List<Person> correctListOfPerson = new ArrayList<>(  );
        correctListOfPerson.add( person1 );
        correctListOfPerson.add( person4 );
        correctListOfPerson.add( person2 );
        correctListOfPerson.add( person3 );

        SortedMethod sortedMethod = new SortedMethod();

        Assert.assertArrayEquals(correctListOfPerson.toArray(), sortedMethod.sort( listOfPersonToTest ).toArray() );
    }

}