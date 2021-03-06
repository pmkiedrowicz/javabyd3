package com.sda.javabyd3.mizi.exg001.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Created by Michal Ziolecki.
 */
public class Zad5 {
    public static void main(String[] args) {
        Person person;
        List<Person> listOfPerson = new ArrayList <>(  );

        for(int i = 1; i <11 ; i++)
        {
            person = new Person();
            person.setName("NameID" + i);
            person.setSurname( "SurnameID" + i );
            person.setSalary(3000 + i*100);
            listOfPerson.add( person );
        }


        OptionalDouble avarage = OptionalDouble.empty();
        avarage = listOfPerson.stream().mapToDouble( item -> item.getSalary() ).average();
        Double avarage2 = avarage.getAsDouble();
        System.out.println("srednia placa " + avarage2);
        System.out.println("Wieksze place od sredniej to: ");
        listOfPerson.stream().filter( item -> item.getSalary() > avarage2 )
                .forEach( item -> System.out.print(" " + item.getSalary() ) );


    }
}
