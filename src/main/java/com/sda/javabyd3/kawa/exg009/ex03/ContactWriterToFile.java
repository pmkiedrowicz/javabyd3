package com.sda.javabyd3.kawa.exg009.ex03;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ContactWriterToFile {

    public boolean writingContactsToFile (List<Contacts> args){
        boolean result = true;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("C:\\Users\\Lenovo\\Desktop\\kon\\contacts.json"),args);
        } catch (IOException e) {
            result = false;
            e.printStackTrace();
        }
        return result;
    }
}
