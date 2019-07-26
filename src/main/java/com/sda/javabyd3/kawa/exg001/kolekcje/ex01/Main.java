package com.sda.javabyd3.kawa.exg001.kolekcje.ex01;

public class Main {
    public static void main(String[] args) {

        Person imiona = new Person();
        imiona.addingToList(new String[] {"Pawel","Kasia","Basia","Szymon","Michal"});
        imiona.sortingNames(imiona.names);
    }
}
