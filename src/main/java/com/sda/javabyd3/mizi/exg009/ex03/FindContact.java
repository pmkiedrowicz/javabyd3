package com.sda.javabyd3.mizi.exg009.ex03;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Michal Ziolecki.
 */
public class FindContact {

    List<PersonalData> listOfPerson;
    PersonalData person = new PersonalData(  );
    public FindContact(List<PersonalData> list)
    {
        listOfPerson = list;
    }

    public PersonalData findByElement(String filteredBy, String info)
    {
        switch (filteredBy)
        {
            case "EMAIL":
                listOfPerson.stream().filter( element -> element.getMailAddress(  ).contains( info ) )
                        .forEach( item -> System.out.println(item.toString()) );
                break;
            case "NAME":
                listOfPerson.stream().filter( element -> element.getName(  ).contains( info ) )
                        .forEach( item -> System.out.println(item.toString()) );
                break;
            case "SURNAME":
                listOfPerson.stream().filter( element -> element.getSurname(  ).contains( info ) )
                        .forEach( item -> System.out.println(item.toString()) );
                break;
            case "TELEPHON":
                listOfPerson.stream().filter( element -> element.getTelefonNumber(  ).contains( info ) )
                        .forEach( item -> System.out.println(item.toString()) );
                break;
                // ppkt d
            case "ALL":
                listOfPerson.stream().filter( element -> element.getTelefonNumber(  ).contains( info )
                        || element.getName(  ).contains( info ) || element.getSurname().contains( info )
                || element.getTelefonNumber(  ).contains( info ))
                        .forEach( item -> System.out.println(item.toString()) );
                break;
        }

        return person;
    }
}
