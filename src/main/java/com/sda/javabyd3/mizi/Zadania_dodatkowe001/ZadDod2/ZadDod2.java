package com.sda.javabyd3.mizi.Zadania_dodatkowe001.ZadDod2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class ZadDod2 {


    public static void main(String[] args) {
        Random random = new Random(  );
        Scanner scanner = new Scanner( System.in );


        System.out.println("Zaczynamy gre odradniecia pieciu sum...");
        Double avarage = 0.0;
        Integer score = 0;
        Double[] tableOfTime= new Double[5];
        Boolean[] tableOfScore = new Boolean[5];
        for(int i = 1; i < 6; i++)
        {
            String ready = "";
            while(ready.length() == 0){
                System.out.println("ready test 2: " + ready);
                System.out.println("zaczynamy runde :) Czy jestes gotów? (dowolny znak)");
                ready =  scanner.next(  );
            }
            System.out.println("System losuje liczbe do odgadniecia: ");
            Integer randomNumber1 = random.nextInt( 51 );
            Integer randomNumber2 = random.nextInt( 51 );
            System.out.println("Program wylosowal liczbe od 0 do 50 :) ");
            System.err.println("Suma liczb: " + randomNumber1
                    + " + " + randomNumber2 + " to: ");
            try {
                Thread.sleep( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println( "Zacznijmy w grę - zgadnij sume:" );
            Double start = System.currentTimeMillis()/1000d;

            Integer sum = randomNumber1 + randomNumber2;
            Integer answer;

            System.out.println("Seria numer: " + i);

            answer = scanner.nextInt();
            Double end = System.currentTimeMillis()/1000d;
            tableOfTime[i-1] = end - start;
            System.out.println("Czas rundy: " + tableOfTime[i-1] );
            if( answer == sum) {
                System.err.println("Gratulacje odgadles sume!");
                try {
                    Thread.sleep( 500 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                tableOfScore[i-1] = true;
                avarage += tableOfTime[i-1];
            }
            else {
                tableOfScore[i-1] = false;
                System.err.println("Niestety nie odgadles liczby :( ");
                try {
                    Thread.sleep( 500 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                avarage += tableOfTime[i-1];
            }
        }
        for(boolean item : tableOfScore)
        {
            if(item == true) score++;
        }

        avarage = (Double)avarage/5;
        System.out.println("Uzyskales wynik: " + score);
        System.out.println("Sredni czas to: " + avarage);
    }
}
