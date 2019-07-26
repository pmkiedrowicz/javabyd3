package com.sda.javabyd3.jaja.exg001.ex21;

public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new Zadanie21());
        thread.start();
    }
}
