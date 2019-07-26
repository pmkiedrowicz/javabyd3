package com.sda.javabyd3.syga.exg001.Ogolne.ex05;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

            Random random = new Random();
            HashMap<Integer, Integer> mapOfNumbers = new HashMap<>();
            int randomNumber = 0;

            for (int i = 0; i < 100; i++) {
                randomNumber = random.nextInt(201);
                if (mapOfNumbers.containsKey(randomNumber)){
                    mapOfNumbers.put(randomNumber, mapOfNumbers.get(randomNumber) + 1);
                }else{
                    mapOfNumbers.put(randomNumber, 1);
                }
            }
            System.out.println(mapOfNumbers);
            List<Integer> listOfRepeatingNumbers = mapOfNumbers.entrySet()
                    .stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .map(entry -> entry.getKey())
                    .limit(5)
                    .collect(Collectors.toList());
        System.out.println(listOfRepeatingNumbers);


        }
}
