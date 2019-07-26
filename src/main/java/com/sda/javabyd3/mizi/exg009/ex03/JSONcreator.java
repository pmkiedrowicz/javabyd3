package com.sda.javabyd3.mizi.exg009.ex03;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class JSONcreator {

    Scanner scanner;
    ContactCodeCreator contactCodeCreator;
    List<PersonalData> listOfPersonalData;
    List<PersonalData> temporaryList;
    OperationOnFiles operationOnFiles;
    ObjectMapper mapper;

    public JSONcreator()
    {
        this.scanner = new Scanner( System.in );
        this.contactCodeCreator = new ContactCodeCreator();
        this.listOfPersonalData = new ArrayList<>(  );
        this.temporaryList = new ArrayList <>(  );
        this.operationOnFiles = new OperationOnFiles();
        this.mapper = new ObjectMapper(  );
    }

    public void printToFileWithJSONformat()
    {
        System.out.println("Podaj ile kontaktow stworzyc: ");
        int howMany = scanner.nextInt();
        for(int i = howMany; i > 0; i--)
        {
            temporaryList = readFromFileWithJSONformat();
            listOfPersonalData.add(  contactCodeCreator.contactCreator() );
            temporaryList.stream().forEach( element -> listOfPersonalData.add( element ) );
        }
        try {
            mapper.writeValue( new File( operationOnFiles.pathToFilePersonalData ), listOfPersonalData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<PersonalData> readFromFileWithJSONformat(){
        List<PersonalData> listToReturn = new ArrayList <>(  );
        try {
            listToReturn = mapper.readValue( new File( operationOnFiles.pathToFilePersonalData ),
                    new TypeReference<List<PersonalData>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listToReturn;
    }

}
