package com.sda.javabyd3.jaja.exg001.ex21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Zadanie21 implements Runnable{


    ExecutorService executorService = Executors.newFixedThreadPool(5);{

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try { for (int i = 1; i<=5; i++){
                    System.out.println("Wątek nr " + i + " START! ");
                    for (int j =1; j<=10; j++){
                        System.out.println("Wątek nr " + i + " liczba: " + j);
                        Thread.sleep(1000);
                    }
                    System.out.println("Wątek nr " + i + " KONIEC! ");
                    Thread.sleep(1000);
                }
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        });}

    @Override
    public void run() {

    }
}
