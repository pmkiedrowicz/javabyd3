package com.sda.javabyd3.lusi.exg009.ex03;

import java.util.List;

public interface FileWriterReader {
    List<Person> readPersonsFromFile();

    boolean writePersonsToFile(List<Person> personList);
}
