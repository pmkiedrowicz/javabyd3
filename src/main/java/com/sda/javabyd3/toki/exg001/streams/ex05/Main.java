package com.sda.javabyd3.toki.exg001.streams.ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Worker> workerList = new ArrayList<>();

        workerList.add(new Worker("Jan", "Kowalski", 2000));
        workerList.add(new Worker("Jan2", "Kowalski2", 1000));
        workerList.add(new Worker("Jan3", "Kowalski3", 3000));
        workerList.add(new Worker("Jan4", "Kowalski4", 15000));
        workerList.add(new Worker("Jan5", "Kowalski5", 6000));
        workerList.add(new Worker("Jan6", "Kowalski6", 9000));
        workerList.add(new Worker("Jan7", "Kowalski7", 18000));
        workerList.add(new Worker("Jan8", "Kowalski8", 5000));
        workerList.add(new Worker("Jan9", "Kowalski9", 4000));
        workerList.add(new Worker("Jan10", "Kowalski10", 500));

        Stream stream = new Stream();
        System.out.println("Average salary: " + stream.average(workerList));
        stream.moreThanAverage(workerList);
    }
}
