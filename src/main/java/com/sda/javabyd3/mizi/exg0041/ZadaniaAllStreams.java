package com.sda.javabyd3.mizi.exg0041;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by Michal Ziolecki.
 */
public class ZadaniaAllStreams {
    public static void main(String[] args) {
        int [] numbers = new int []{ 148 , 105 , 36 , 37 , 56 , 132 , 121 , 36 , 180 ,
                8 , 61 , 171 , 180 , 6 , 65 , 0 , 66 , 58 , 162 , 25 , 128 , 35 , 32 , 4 , 104 ,
                6 , 75 , 31 , 66 , 125 , 188 , 159 , 121 , 61 , 173 , 188 , 34 , 141 , 182 ,
                192 , 18 , 18 , 165 , 136 , 76 , 64 , 41 , 195 , 147 , 74 };

        int[] newTabelint = new int[numbers.length];
        Integer[] newTabelInteger = new Integer[numbers.length];
        List<Integer> listOfNumbers = new ArrayList <>(  );

        System.out.println("Wszystkie elementy posortowane: ");
        Arrays.stream( numbers ).sorted().forEach( item ->{
            System.out.print(" " + item);
        }  );
        System.out.println("\n Maksymalna wartosc ZAD 1: " + Arrays.stream( numbers ).sorted().max().getAsInt());
        System.out.println("Minimalna wartosc ZAD 2: " + Arrays.stream( numbers ).sorted().min().getAsInt());
        System.out.println("Srednia wartosc ZAD 3: " + Arrays.stream( numbers ).average().getAsDouble());
        System.out.println("Suma wartosc ZAD 4: " + Arrays.stream( numbers ).sum());
        System.out.println("Wieksza wartosc od sredniej ZAD 5: ");
        Arrays.stream( numbers )
                .filter( item -> item > Arrays.stream( numbers ).average().getAsDouble() ).sorted()
                .forEach( item -> System.out.print(" " + item)  );
        System.out.println("\n Srednia 5 elementow wiekszych od wartosci sredniej wartosc ZAD 6: "
                +  Arrays.stream( numbers ).sorted()
                .filter( item -> item > Arrays.stream( numbers ).average().getAsDouble() )
                .limit( 5 ).average().getAsDouble() );
        System.out.println("Pierwiastek wszystkich liczb ZAD 7: " );
        Arrays.stream( numbers )
                .forEach( item -> System.out.printf(" %.2f" , Math.sqrt( item )  ));
    }
}
