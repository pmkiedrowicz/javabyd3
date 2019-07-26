package com.sda.javabyd3.mizi.Zadania_dodatkowe001.ZadDod1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class ZadDod1 {
    public static void main(String[] args) {
        Random random = new Random(  );
        Scanner scanner = new Scanner( System.in );

        System.out.println("System losuje liczbe do odgadniecia: ");
        Integer randomNumber = random.nextInt( 100 );
        System.out.println("Program wylosowal liczbe od 0 do 99 :) ");
        System.out.println( "Zagrajmy w grę - zgadnij liczbę" );

        //System.out.println("Odp. Wylosowana liczba: " + randomNumber);
        while(true)
        {
            System.out.println("Podaj liczbe: ");
            Integer number = scanner.nextInt();
            if( number > randomNumber) System.out.println("Liczba "+ number +" jest wieksza od szukanej");
            else if(number < randomNumber) System.out.println("Liczba "+ number +" jest mniejsza od szukanej");
            else if( number == randomNumber) {
                System.out.println("Gratulacje odgadles liczbe ! \n Wynik to: " + randomNumber);
                break;
            }
        }
    }
}
