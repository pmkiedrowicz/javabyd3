package com.sda.javabyd3.jaja.exg012.ex02;

public class Main {

    public static void main(String[] args) {
        GenericTableToList genericTableToList = new GenericTableToList();
        Integer[] intNumber = {1,5,3,4,6};
        Character[] characters = {'a', 'b', 'c'};
        genericTableToList.displaysAsList(intNumber);
        genericTableToList.displaysAsList(characters);
    }
}
