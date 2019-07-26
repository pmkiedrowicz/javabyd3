package com.sda.javabyd3.mizi.exg001.Kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Zad4 {
    public static void main(String[] args) {
        List<String> matrix = new ArrayList <>(  );
        matrix.add( "Michal" );
        matrix.add( "Sara" );
        matrix.add( "Ania" );
        matrix.add( "Ela" );
        matrix.add( "Jarek" );
        matrix.add( "Janusz" );
        matrix.add( "Kamil" );
        matrix.add( "Karolina" );
        matrix.add( "Zaneta" );
        matrix.add( "Marcin" );
        Scanner scanner = new Scanner( System.in );
        String inPut;
        System.out.println("Zawartosc matrycy przed: ");
        for (String item: matrix) {
            System.out.print(" " + item);
        }

        System.out.println("\n Podaj imiona ktore chcesz dodac do matrycy");

        while(true)
        {
            inPut = scanner.nextLine();
            if(inPut.equals( "koniec" ) == true) break;
            if(matrix.contains( inPut ) != true) matrix.add( inPut );
            else System.out.println("To imie jest juz w martycy");
        }

        System.out.println("Zawartosc matrycy po: ");
        for (String item: matrix) {
            System.out.print(" " + item);
        }

    }
}
