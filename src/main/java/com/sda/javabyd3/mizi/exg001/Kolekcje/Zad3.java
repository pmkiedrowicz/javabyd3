package com.sda.javabyd3.mizi.exg001.Kolekcje;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Michal Ziolecki.
 */
public class Zad3 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList <>(  );
        Queue<String> queueTemp;
        for(int i =1 ; i <11 ;i++)
        {
            String client= "Id " + i;
            System.out.print(" " + client);
            queue.add( client );
        }

        System.out.println("\n Pierwsza osoba w kolejce: " + queue.element());
        //czyta druga nie pierwsza osobe
        /*System.out.println("Ostatnie osoba w kolejce: " +  queue.stream()
                .sorted( (int1, int2) -> int2.compareTo( int1 ) ).findFirst());*/

        //rozwiazanie zapasowe
        while(true)
        {
            String element = queue.poll();
            if(queue.isEmpty() == true)
            {
                System.out.println("Ostatni element: " + element);
                break;
            }

        }
    }
}
