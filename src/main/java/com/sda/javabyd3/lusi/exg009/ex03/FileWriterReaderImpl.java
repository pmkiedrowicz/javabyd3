package com.sda.javabyd3.lusi.exg009.ex03;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileWriterReaderImpl implements  FileWriterReader {

    ObjectMapper mapper = new ObjectMapper();
    private String fileDir = System.getProperty("user.home") + "\\Desktop\\user.json";

    public List<Person> readPersonsFromFile() {
        List<Person> users = null;
        try {
            users = mapper.readValue(new File(fileDir), new TypeReference<List<Person>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    public boolean writePersonsToFile(List<Person> personList) {
        boolean result = true;
        try {
            mapper.writeValue(new File(fileDir), personList);
        } catch (IOException e) {
            result = false;
            e.printStackTrace();
        }
        return result;
    }
}
