package com.sda.javabyd3.mizi.exg007.Zad1;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        Converter converter = new Converter();
        System.out.println("Zamiana stopni: \n wpisz 'c' aby zamienic C -> F \n wpisz 'f' aby zamienic F -> C ");
        String inPut = scanner.nextLine();

        if(inPut.equals( "c" ))
        {
            System.out.println("Podaj ilosc stopni Celcjusza: ");
            Double celcius = scanner.nextDouble();
            System.out.printf("%.2f stopni celcjusza to %.2f Fehrenheita",celcius
                    , converter.celciusToFehrenheit( celcius ) );
        }
        else if( inPut.equals( "f" ))
        {
            System.out.println("Podaj ilosc stopni Fehrenheita: ");
            Double fehrenheit = scanner.nextDouble();
            System.out.printf("%.2f stopni Celcjusza to %.2f Fehrenheita",fehrenheit
                    , converter.fehrenheitToCelcius( fehrenheit ) );
        }
    }
}
