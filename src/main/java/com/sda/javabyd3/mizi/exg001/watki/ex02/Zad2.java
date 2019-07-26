package com.sda.javabyd3.mizi.exg001.watki.ex02;

/**
 * Created by Michal Ziolecki.
 */
public class Zad2 extends Thread{
    @Override
    public void run() {
        for(int i=1; i<11; i++)
        {
            System.out.println(" " + i);
            try{
                Thread.sleep( 100 );
            }catch (InterruptedException e)
            {
                e.getStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("Main przed watkami");
        System.out.println("\n Rusza watek 1. ");
        new Thread( new Zad2() ).start();
        System.out.println("\n Rusza watek 2. ");
        new Thread( new Zad2() ).start();
        System.out.println("\n Main za watkami");
    }
}
