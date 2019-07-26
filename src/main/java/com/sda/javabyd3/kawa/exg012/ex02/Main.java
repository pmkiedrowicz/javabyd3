package com.sda.javabyd3.kawa.exg012.ex02;

public class Main {
    public static void main(String[] args) {

        Integer [] myIntList = {3,2,1,3,2,3,123};
        Double [] myDoubleList = {32.1,33.2,2132.3,312.4,21.1};
        Character [] myCharList = {'s','b','3','f','7'};

        TableToList tableToList = new TableToList();
        System.out.println("Tab of Integers - " + tableToList.addingFromTableToList(myIntList));
        System.out.println("Tab of Doubles - " + tableToList.addingFromTableToList(myDoubleList));
        System.out.println("Tab of Characters - " + tableToList.addingFromTableToList(myCharList));
    }
}
