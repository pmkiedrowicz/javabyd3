package com.sda.javabyd3.kawa.exg001.ogolne.ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BigestLowestFinder {

    private List<Integer> listOf1000Numbs = new ArrayList<>();
    private Random randomizer = new Random();

    public void generating1000Numbs() {
        while (listOf1000Numbs.size() < 1000) {
            listOf1000Numbs.add(randomizer.nextInt(1001) + 1000);
        }
    }

    public void showBiggestNumb() {
        int max = listOf1000Numbs.stream()
                .reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("Najwyzsza wylosowana wartosc to: " + max);
    }

    public void showLowestNumb(){
        int min = listOf1000Numbs.stream()
                .reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println("Najnizsza wylosowana wartosc to: " + min);
    }
}
