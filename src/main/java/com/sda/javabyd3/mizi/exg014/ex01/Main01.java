package com.sda.javabyd3.mizi.exg014.ex01;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main01 {
    public static void main(String[] args) {
        CharactersReverser charactersReverser = new CharactersReverser();
        Scanner scanner = new Scanner( System.in );
        System.out.println("Podaj sekwencje: ");
        String inPut = scanner.nextLine();
        long timeStart1 = System.currentTimeMillis();
        //System.out.println("time start: " + timeStart1);
        System.out.println("Odwrocona sekwencja w petli: " + charactersReverser.reverser( inPut ));
        long timeEnd1 = System.currentTimeMillis();
       // System.out.println("time end: " + timeEnd1);
        long timeOfAlgorithm = timeEnd1 - timeStart1;
        System.out.println(" Czas algorytmu w petli: " + timeOfAlgorithm + " ms");
        long timeStart2 = System.currentTimeMillis();
        System.out.println("Odwrocona sekwencja rekurencyjnie: "
                + charactersReverser.reverserWithRecursionMethod( inPut,"" ,0));
        long timeEnd2 = System.currentTimeMillis();
        timeOfAlgorithm = timeEnd2 - timeStart2;
        System.out.println(" Czas algorytmu rekurencyjnego: " + timeOfAlgorithm + " ms");
    }
}
