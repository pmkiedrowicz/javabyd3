package com.sda.javabyd3.mizi.exg010.ex03;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Michal Ziolecki.
 */
public class SortedMethod {

    public List<Person> sort(List<Person> list)
    {
        List<Person> listOfPerson = new ArrayList <>(  );
        listOfPerson = list;

        listOfPerson = listOfPerson.stream().sorted( (per1, per2) ->
                Double.compare( per1.getBankAccountList().stream().mapToDouble( item -> item.getBalance() ).sum(),
                        per2.getBankAccountList().stream().mapToDouble( item -> item.getBalance() ).sum()  ))
                .collect( Collectors.toList());

        listOfPerson.forEach( person -> System.out.println(" " + person.toString()) );

        return listOfPerson;
    }
}
