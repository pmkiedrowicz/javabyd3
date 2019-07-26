package com.sda.javabyd3.kawa.exg001.Watki.ex02;

public class Main {
    public static void main(String[] args) {

        new Thread(new My1Thread()).start();
        System.out.println("Czo te watki");
        new Thread(new My1Thread()).start();
        System.out.println("Po wszystkim");
    }
}
