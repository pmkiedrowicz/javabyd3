package com.sda.javabyd3.mabr.zadania001.watki;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main5 {
    public volatile static List<String> listOfFileName = new ArrayList<>();

    public static void main(String[] args) {
        ListsZ5 listsZ5 = new ListsZ5();
        List<Thread> listOfThread = new ArrayList<>();
        Zad5 zad5 = new Zad5();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc watkow jakie utworzyc  (tyle powstanie plikow badz rozsadny): ");
        Integer numberOfThread = scanner.nextInt();
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThread);
        for (int i = numberOfThread; i > 0; i--) {
            executorService.execute(zad5);
        }
        executorService.shutdown();
        while (true) {
            if (executorService.isTerminated() && listOfFileName.size() == numberOfThread) {
                System.out.println("Drukuje powstałe pliki: ");
                for (String item : listOfFileName) {
                    System.out.println(" " + item);
                }
                break;
            }
        }
    }
}
