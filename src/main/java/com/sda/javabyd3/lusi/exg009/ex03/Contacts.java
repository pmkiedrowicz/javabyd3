package com.sda.javabyd3.lusi.exg009.ex03;

import java.util.List;
import java.util.stream.Collectors;

public class Contacts {

    FileWriterReader personReaderWriter;

    private List<Person> persons = null;

    public Contacts(FileWriterReader personReaderWriter) {
        this.personReaderWriter = personReaderWriter;
    }

    public void loadContats() {
        persons = personReaderWriter.readPersonsFromFile();
    }

    public List<Person> searchBy(SearchByEnum searchBy, String text) {
        List<Person> result = null;
        switch (searchBy) {
            case EMAIL:
                result = persons.stream().filter(p -> p.getEmail().contains(text)).collect(Collectors.toList());
                break;
            case LAST_NAME:
                result = persons.stream().filter(p -> p.getSurname().contains(text)).collect(Collectors.toList());
                break;
            case TELEPHONE:
                result = persons.stream().filter(p -> p.getTelephoneNumber().contains(text)).collect(Collectors.toList());
                break;
            case NAME:
                result = persons.stream().filter(p -> p.getName().contains(text)).collect(Collectors.toList());
                break;
            case ALL:
                result = persons.stream().filter(p ->
                        p.getName().contains(text) ||
                                p.getTelephoneNumber().contains(text) ||
                                p.getSurname().contains(text) ||
                                p.getEmail().contains(text)
                ).collect(Collectors.toList());
                break;
            default:
                break;
        }
        return result;
    }
}
