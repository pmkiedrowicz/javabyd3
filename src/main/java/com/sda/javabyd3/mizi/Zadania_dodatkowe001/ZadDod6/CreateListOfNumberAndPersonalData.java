package com.sda.javabyd3.mizi.Zadania_dodatkowe001.ZadDod6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Michal Ziolecki.
 */
public class CreateListOfNumberAndPersonalData {

    List<String> listOfNumbers;
    List<String> lisOfPersonalData;
    Random random;

    public CreateListOfNumberAndPersonalData()
    {
        this.listOfNumbers = new ArrayList <>(  );
        this.lisOfPersonalData = new ArrayList <>(  );
        this.random = new Random(  );
    }

    public List<String> createListOfNumbers()
    {
        for(int j =0; j < 20; j++)
        {
            String number = "";
            for(int i = 0; i < 9; i++)
            {
                number += random.nextInt(10);
            }
            listOfNumbers.add( number );
        }
        return listOfNumbers;
    }

    public List<String> createListOfPersonalData()
    {
        for(int j = 1; j < 21; j++)
        {
            String name = "Imie Nazwisko" + j;
            lisOfPersonalData.add( name );
        }
        return lisOfPersonalData;
    }
}
