package com.sda.javabyd3.kawa.exg001.kolekcje.ex02;

import java.util.HashMap;
import java.util.Random;

public class Get10RandomNumbs {

    private Random random = new Random();
    private HashMap<Integer, Integer> myRandom10Numbs = new HashMap<>();
    private int i = 1;

    public void gettingRandom10() {
        while (myRandom10Numbs.size() < 10) {
            myRandom10Numbs.put(i, random.nextInt(100));
            i++;
        }
        myRandom10Numbs.forEach((key, value) -> System.out.println("Numerek " + key + " to liczba " +
                value));
    }
}
