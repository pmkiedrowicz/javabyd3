package com.sda.javabyd3.kawa.exg012.ex01;

public class Main {
    public static void main(String[] args) {

        Integer [] myIntList = {3,2,1,3,2,3,123};
        Double [] myDoubleList = {32.1,33.2,2132.3,312.4,21.1};
        Character [] myCharList = {'s','b','3','f','7'};

        GetSomeGenerics getSomeGenerics = new GetSomeGenerics();
        System.out.println("------------tab with Integers------------");
        getSomeGenerics.gettingSomeGenerics(myIntList);
        System.out.println("------------tab with Doubles-------------");
        getSomeGenerics.gettingSomeGenerics(myDoubleList);
        System.out.println("------------tab with Characters----------");
        getSomeGenerics.gettingSomeGenerics(myCharList);

    }
}
