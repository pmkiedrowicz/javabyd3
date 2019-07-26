package com.sda.javabyd3.mabr.exg001.ex05;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Przygotuj program, który losuje 100 wartości z przedziału 0-200 korzystając z klasy
 * Random. Program po losowaniu zlicza powtórzenia każdej z liczb i wyświetla 5 liczb
 * które najczęściej się powtarzają w kolejności malejącej
 */
public class Main5 {
    private final static Random random = new Random();

    public static void main(String[] args) {

        HashMap<Integer, Integer> numbers = new HashMap<>();
        IntStream.rangeClosed(1, 100).forEach(element -> {
            Integer randomNumber = random.nextInt(201);
            if (numbers.containsKey(randomNumber)) {
                numbers.put(randomNumber, numbers.get(randomNumber) + 1);
            } else {
                numbers.put(randomNumber, 1);
            }
        });
        System.out.println(numbers);
        List<Integer> listOfMaxNumbers = numbers.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(entry -> entry.getKey())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(listOfMaxNumbers);
    }
}

