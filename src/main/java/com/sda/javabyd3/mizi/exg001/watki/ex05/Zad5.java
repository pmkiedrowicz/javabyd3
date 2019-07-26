package com.sda.javabyd3.mizi.exg001.watki.ex05;

import java.io.IOException;
import java.util.Random;

/**
 * Created by Michal Ziolecki.
 */
public class Zad5 extends Thread{


    @Override
    public void run() {
        PersonZ5 personZ5 = new PersonZ5();
        personZ5.setName( randomName() );
        personZ5.setSurname(randomSurname());
        personZ5.setAge( randomAge() );
        String nameOfFile = randomNameOfFile();
        Main5.listOfFileName.add( nameOfFile );
        System.out.println("rozmiar list plikow " + Main5.listOfFileName.size());
        SaveToFileZ5 saveToFileZ5 = new SaveToFileZ5( personZ5, nameOfFile );
        try {
            saveToFileZ5.saveFileinDirectory();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String randomName()
    {
        Random random = new Random(  );
        String nameFromList;
        Integer positionOfList;
        positionOfList =  random.nextInt( 10 );
        nameFromList = ListsZ5.listOfName.get( positionOfList );

        return  nameFromList;
    }

    private String randomSurname()
    {
        Random random = new Random(  );
        String SurnameFromList;
        Integer positionOfList;
        positionOfList =  random.nextInt( 10 );
        SurnameFromList = ListsZ5.listOfSurname.get( positionOfList );

        return  SurnameFromList;
    }

    private Integer randomAge()
    {
        Random random = new Random(  );
        Integer age;
        age =  random.nextInt( 100 );

        return  age;
    }

    private String randomNameOfFile()
    {
        Random random = new Random(  );
        String NameOfFile;
        Integer randomElementOfName;
        randomElementOfName =  random.nextInt( 100 );
        NameOfFile = Thread.currentThread().getName()+ "rand" + randomElementOfName;

        return  NameOfFile;
    }

}
