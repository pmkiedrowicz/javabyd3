package com.sda.javabyd3.mizi.exg001.Ogolne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Michal Ziolecki.
 */
public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        List<Integer> listOfNumber = new ArrayList<>(  );
        int counter = 1;

        System.out.println("Podaj liczby: ");
        while(true)
        {

            System.out.println("liczba " + counter +":");
            String inPut = scanner.nextLine();
            Pattern pattern = Pattern.compile("[0-9]+" );
            Matcher matcher = pattern.matcher( inPut  );
            if(matcher.matches() || inPut.equals( "koniec" ))
            {
                if(inPut.equals( "koniec" ) != true)
                {
                    Integer inPutNumber = Integer.parseInt( inPut );
                    listOfNumber.add( inPutNumber );
                    counter++;
                }
                if(inPut.equals( "koniec" ) == true) break;
            }
            else System.out.println("To nie byla liczba - podaj liczbe ponownie.");
            System.out.println("Aby zakonczyc podawanie liczb napisz 'koniec' ");
        }

        listOfNumber.sort( (item1, item2) -> item1.compareTo( item2 ) );

        System.out.println("Najmniejsza liczba to: " + listOfNumber.get( 0 ));
        System.out.println("Najwieksza liczba to: " + listOfNumber.get( listOfNumber.size()-1 ));
        System.out.print("Suma liczb to: ");
        Integer sum = 0;
        for(Integer item : listOfNumber)
        {
            sum += item;
        }
        System.out.println(sum);
    }
}
