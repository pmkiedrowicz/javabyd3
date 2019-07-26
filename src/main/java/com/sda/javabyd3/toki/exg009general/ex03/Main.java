package com.sda.javabyd3.toki.exg009general.ex03;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String pathToSaveFile = "D:\\data.txt";
        Person person = new Person();
        CreateContact createContact = new CreateContact();
        Scanner scanner = new Scanner(System.in);
        List<Person> personDataList = new ArrayList<>();
        List<Person> list = new ArrayList<>();
        String filterIt = "";

        System.out.println("Creating contacts... ");
        String end = "";
        while (!end.equals("end")) {
            personDataList.add(createContact.CreateContact());
            System.out.println("Do U want to end adding contacts? Type 'end' to finish it or Enter to continue.");
            end = scanner.nextLine();
        }
        scanner.close();

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File(pathToSaveFile), personDataList);
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        ReadJsonFile readJsonFile = new ReadJsonFile();
        readJsonFile.readJsonFile(pathToSaveFile, list);
        System.out.println(readJsonFile.readJsonFile(pathToSaveFile, list));


    }
}
