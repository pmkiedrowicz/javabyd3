package com.sda.javabyd3.mizi.exg001.watki.ex01;

/**
 * Created by Michal Ziolecki.
 */
public class Zad1 extends Thread{
    public static void main(String[] args) {
       new Thread(new Zad1()).start();
    }

    @Override
    public void run() {
        System.out.println("Hello World");
    }
}
