package com.sda.javabyd3.syga.exg009.ex03;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        ContactCreator contactCreator = new ContactCreator();
        String path = "D:\\Kurs\\Pliki do zadania\\dataPerson.txt";
        List<Person> listOfPerson = new ArrayList<>();
        List<Person> listOfJsonFile = new ArrayList<>();

        System.out.println("Creating contacts.");

        String end = "";
        while(!end.equals("yes")) {
            listOfPerson.add(contactCreator.contactCodeCreator());
            System.out.println("Do you want to finish adding? (Write yes or no)");
            end = scanner.nextLine();
        }
        scanner.close();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File(path), listOfPerson);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ReadJsonFile readJsonFile = new ReadJsonFile();
        System.out.println(readJsonFile.readJsonFile(path, listOfJsonFile));

    }
}
