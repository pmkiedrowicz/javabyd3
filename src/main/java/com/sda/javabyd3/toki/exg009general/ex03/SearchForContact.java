package com.sda.javabyd3.toki.exg009general.ex03;

import java.util.List;

public class SearchForContact {

    //created to return person over findIt method
    Person person = new Person();

    //created temporary list of class Person to work on
    List<Person> listOfPerson;

    public SearchForContact(List<Person> list) {
        listOfPerson = list;
    }

    public Person findIt(String filteredBy, String returnData) {
        switch (filteredBy) {
            case "name":
                listOfPerson.stream().filter(el -> el.getName().contains(returnData) || el.getSurname().contains(returnData)).forEach(el -> System.out.println(el.toString()));
                break;
            case "email":
                listOfPerson.stream().filter(el -> el.getEmail().contains(returnData)).forEach(el -> System.out.println(el.toString()));
                break;
            case "tel":
                listOfPerson.stream().filter(el -> el.getTel().contains(returnData)).forEach(el -> System.out.println(el.toString()));
                break;
        }
        return person;
    }

}
