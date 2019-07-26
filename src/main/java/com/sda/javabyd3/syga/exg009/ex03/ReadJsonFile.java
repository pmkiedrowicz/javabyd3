package com.sda.javabyd3.syga.exg009.ex03;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadJsonFile {
    public ReadJsonFile(){
    }

    public String readJsonFile(String pathToSaveFile, List<Person> list){
        ObjectMapper objectMapper = new ObjectMapper();


        try {
          list = objectMapper.readValue(new File(pathToSaveFile),new TypeReference<List<Person>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }

        return String.valueOf(list);
    }
}
