package com.sda.javabyd3.mizi.exg001.Kolekcje;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String inPut;
        Queue<String> queue = new LinkedList <>(  );
        for(int i =1; i < 11; i++)
        {
            System.out.println("Podaj zadanie numer " + i);
            inPut = scanner.nextLine();
            queue.add( inPut );
        }
        System.out.println("Masz zadan "+ queue.size() + " do zrobienia");

        System.out.println("Kolejka zadan to:");
        int edge = queue.size();
        for( int i = 0; i < edge; i++)
        {
            System.out.println(queue.poll());
        }
    }
}
