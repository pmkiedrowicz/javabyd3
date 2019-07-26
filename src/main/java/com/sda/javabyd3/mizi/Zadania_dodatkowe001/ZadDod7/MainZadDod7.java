package com.sda.javabyd3.mizi.Zadania_dodatkowe001.ZadDod7;

import java.util.HashMap;

/**
 * Created by Michal Ziolecki.
 */
public class MainZadDod7 {
    public static void main(String[] args) {
        Zad7SortedMachine sortMachine = new Zad7SortedMachine();
        String [][] myJogger = new String[5][2];
        //hh:mm:ss

        myJogger[0][0] = "Zawodnik 4"; myJogger[0][1] = "00:59:59";
        myJogger[1][0] = "Zawodnik 3"; myJogger[1][1] = "00:55:25";
        myJogger[2][0] = "Zawodnik 5"; myJogger[2][1] = "01:01:10";
        myJogger[3][0] = "Zawodnik 2"; myJogger[3][1] = "00:52:55";
        myJogger[4][0] = "Zawodnik 1"; myJogger[4][1] = "00:47:55";

        System.out.println("Before: ");
        for(int i = 0; i < myJogger.length; i++){
            System.out.println(i + ". " + myJogger[i][0] + " " + myJogger[i][1]);
        }

        System.out.println("wywoluje funkcje sortmyJogger: ");
        myJogger = sortMachine.SortmyJogger( myJogger );

        System.out.println("After: ");
        for(int i = 0; i < myJogger.length; i++){
            System.out.println( i + ". " + myJogger[i][0] + " " + myJogger[i][1]);
        }

    }
}
/*//dodje czas jakos string dla utrudnienia
        HashMap<String, String> myHashMap = new HashMap <>(  );
        //hh:mm:ss
        myHashMap.put("Zawodnik 4", "00:59:59");
        myHashMap.put("Zawodnik 1", "00:47:55");
        myHashMap.put("Zawodnik 5", "01:01:10");
        myHashMap.put("Zawodnik 2", "00:52:55");
        myHashMap.put("Zawodnik 3", "00:55:25");



        myHashMap.values().stream()
                .sorted( (value1,value2) -> value1.compareTo( value2 ) )
                .forEach( (value) -> System.out.println( "value" + value));*/