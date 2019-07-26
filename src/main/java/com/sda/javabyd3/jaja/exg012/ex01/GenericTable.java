package com.sda.javabyd3.jaja.exg012.ex01;

public class GenericTable {

    public <T> void displayTable (T[] table){
        for (T element:table) {
            System.out.println(element);
        }
    }
}
