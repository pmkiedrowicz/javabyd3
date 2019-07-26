package com.sda.javabyd3.lusi.introduction.regularexpression.ex11;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.sda.javabyd3.lusi.introduction.Utils.displayTextOnConsole;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        PersonParser parser = new PersonParser();
        List<String> lines = obj.getFile("samples/persons.txt");
        List<Person> persons = new ArrayList<>();
        lines.forEach(line -> persons.add(parser.parse(line).get()));

        persons.forEach(person -> displayTextOnConsole(person.toString()));
    }

    private List<String> getFile(String fileName) {
        List<String> result = new ArrayList<>();

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.add(line);
            }
            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
