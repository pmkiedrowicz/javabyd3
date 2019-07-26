package com.sda.javabyd3.mizi.exg001.watki.ex04;

/**
 * Created by Michal Ziolecki.
 */
public class Zad4 extends Thread{
    @Override
    public void run()
    {
        System.out.println("\n Rozpoczynam prace, watek nr: " + Thread.currentThread().getName());
        for(int i = 1; i < 11;  i++)
        {
            System.out.print(" " + i );
        }
        System.out.println(" \n Koncze prace, watek nr: " + Thread.currentThread().getName());
    }
}
