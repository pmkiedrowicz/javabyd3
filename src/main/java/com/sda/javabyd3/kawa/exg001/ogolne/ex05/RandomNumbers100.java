package com.sda.javabyd3.kawa.exg001.ogolne.ex05;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomNumbers100 {

    private HashMap<Integer, Integer> listOfRandomNumbs = new HashMap<>();
    private Random randomNumbers100 = new Random();

    public void randomizer100() {
        IntStream.range(1, 101).forEach(element -> {
            Integer randomising = randomNumbers100.nextInt(201);
            if (listOfRandomNumbs.containsKey(randomising)) {
                listOfRandomNumbs.put(randomising, listOfRandomNumbs.get(randomising) + 1);
            } else {
                listOfRandomNumbs.put(randomising, 1);
            }
        });
        System.out.println(listOfRandomNumbs);
        System.out.println(listOfRandomNumbs.size());
    }

    public void show5MostRepeated() {
        List<Integer> listOfMostRep = listOfRandomNumbs.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(Map.Entry::getKey)
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(listOfMostRep);
    }

}

