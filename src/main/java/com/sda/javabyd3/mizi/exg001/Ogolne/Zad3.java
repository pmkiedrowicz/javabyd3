package com.sda.javabyd3.mizi.exg001.Ogolne;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Michal Ziolecki.
 */
public class Zad3 {
    public static void main(String[] args) {
        Random random = new Random(  );
        List<Integer> listOfNumbers = new ArrayList <>(  );
        Integer randomNumber;
        Integer counter = 1;
        while(true)
        {
            randomNumber = random.nextInt( 100 ) + 1;
            if(listOfNumbers.contains( randomNumber ) == true)
            {
                System.out.println("liczba sie powtorzyla, w losowaniu nr " + counter);
            }
            else
            {
                listOfNumbers.add( randomNumber );
            }
            counter++;
            if(listOfNumbers.size() > 20) break;
        }

        System.out.println("wylosowane lcizby to: ");
        for(Integer item : listOfNumbers)
        {
            System.out.print(" " + item);
        }
    }
}
