package com.sda.javabyd3.syga.exg001.Ogolne.ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> listOfRandomNumbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Integer randomNumber = random.nextInt(1001)+1000;
            listOfRandomNumbers.add(randomNumber);
        }

        System.out.println(listOfRandomNumbers);
        System.out.println("Max number: " + listOfRandomNumbers.stream().max(Integer::compareTo).get());
        System.out.println("Min number: " + listOfRandomNumbers.stream().min(Integer::compareTo).get());



    }
}
