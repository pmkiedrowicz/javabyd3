package com.sda.javabyd3.kawa.exg009.ex03;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ContactsReaderFromFile {

    public List<Contacts> readingContFromFile() {
        List<Contacts> contactsList = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            contactsList = objectMapper.readValue(new File("C:\\Users\\Lenovo\\Desktop\\kon\\contacts.json"),
                    new TypeReference<List<Contacts>>() {
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contactsList;
    }
}