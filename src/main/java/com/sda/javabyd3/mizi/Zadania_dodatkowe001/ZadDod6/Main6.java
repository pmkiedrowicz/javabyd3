package com.sda.javabyd3.mizi.Zadania_dodatkowe001.ZadDod6;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class Main6 {
    public static void main(String[] args) {

        CreateFiles createFiles = new CreateFiles();
        CreateListOfNumberAndPersonalData createData = new CreateListOfNumberAndPersonalData();
        // utworzone listy do zapisania do pliku
        List<String> numbers;
        List<String> personalData;
        // listy zczytane powonie z pliku
        List<String> returnNumbers;
        List<String> returnPersonalData;
        HashMap<String, String> myHashMap = new HashMap <>(  );

        numbers = createData.createListOfNumbers();
        personalData = createData.createListOfPersonalData();

        try {
            createFiles.printToFileKey( numbers );
            createFiles.printToFileValue( personalData );
        } catch (IOException e) {
            e.printStackTrace();
        }

        returnNumbers = createFiles.readFromFileKeys();
        returnPersonalData = createFiles.readFromFileValue();

        for(int i =0; i < returnNumbers.size(); i++)
        {
            myHashMap.put( returnNumbers.get( i ), returnPersonalData.get( i ) );
        }

        try {
            createFiles.printToFileMap( myHashMap );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
