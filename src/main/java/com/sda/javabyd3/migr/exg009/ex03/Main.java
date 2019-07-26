package com.sda.javabyd3.migr.exg009.ex03;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        List<Person> list = new ArrayList<>();

        list.add(new Person("Michał", "Grabowski", 123123, "michal@asd.pl"));
        list.add(new Person("Andrzej", "Wiśniewski", 465456, "andrzej@sada.pl"));
        list.add(new Person("Karol", "NieUmie", 798789, "karol@asd.pl"));

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File("d:\\file.json"), list);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Person> list1 = new ArrayList<>();
        try {

            list1 = mapper.readValue(new File("d:\\file.json"),new TypeReference<List<Person>>() {} );
            list1.stream().forEach(e-> System.out.println(e));

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }






    }

}
