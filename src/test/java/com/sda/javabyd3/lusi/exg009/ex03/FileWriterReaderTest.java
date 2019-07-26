package com.sda.javabyd3.lusi.exg009.ex03;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FileWriterReaderTest {

    @Test
    public void readWritePersonsFromFile() {
        FileWriterReaderImpl fw = new FileWriterReaderImpl();
        List<Person> personList = new ArrayList<>();
        personList.add(Person.builder()
                .name("Jan")
                .surname("Kowalski")
                .email("jan_kowalski@gmail.com")
                .telephoneNumber("+48505055123").build());

        fw.writePersonsToFile(personList);
        List<Person> personListFromFile = fw.readPersonsFromFile();
        Assert.assertEquals(personList.size(), personListFromFile.size());
        Assert.assertEquals(personList, personListFromFile);
    }
}