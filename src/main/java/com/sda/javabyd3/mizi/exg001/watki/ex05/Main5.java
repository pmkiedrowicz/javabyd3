package com.sda.javabyd3.mizi.exg001.watki.ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Michal Ziolecki.
 */
public class Main5 {

    public volatile static List<String> listOfFileName = new ArrayList <>(  );
    public static void main(String[] args) {

        ListsZ5 listsZ5 = new ListsZ5();
        List<Thread> listOfThread = new ArrayList <>(  );
        Zad5 zad5 = new Zad5();
        Scanner scanner = new Scanner( System.in);
        System.out.println("Podaj ilosc watkow jakie utworzyc  (tyle powstanie plikow badz rozsadny): ");
        Integer numberOfThread = scanner.nextInt();
        ExecutorService executorService = Executors.newFixedThreadPool( numberOfThread );

        for(int i = numberOfThread; i > 0 ; i--)
        {
            executorService.execute( zad5 );
        }

        executorService.shutdown();

        //petla czeka na zakonczenie watkow
         while(true)
        {
            if(executorService.isTerminated() == true && listOfFileName.size() == numberOfThread)
            {
                System.out.println("Drukuje powstałe pliki: ");
                //System.out.println("size " + listOfFileName.size());
                for (String item : listOfFileName)
                {
                    System.out.println(" " + item);
                }
                break;
            }
        }
    }
}
