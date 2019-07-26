package com.sda.javabyd3.kawa.exg001.kolekcje.ex03;

public class Main {
    public static void main(String[] args) {

        QueueToDoc justAQueue = new QueueToDoc();
        justAQueue.addingPplToQueue(new String[] {"Basia","Kasia","Marta","Tadeusz","Michal","Eryk","Bogdna",
                "Tomasz","Maciej","Pawel"});
        justAQueue.showFirstAndLastInQueue(justAQueue.listOfPpl);

    }
}
