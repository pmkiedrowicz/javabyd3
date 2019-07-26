package com.sda.javabyd3.jaja.exg012.ex01;

public class Main {

    public static void main(String[] args) {
        GenericTable genericTable = new GenericTable();
        Integer [] intNumbers = {1,6,3,2,4};
        Double [] doubleNumbers = {1.3,4.6,2.9,1.1};
        Character [] characters = {'d','f','c','z'};
        genericTable.displayTable(intNumbers);
        genericTable.displayTable(doubleNumbers);
        genericTable.displayTable(characters);
    }
}
