package com.sda.javabyd3.daol.exg001.ex05;


import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {

        HashMap<Integer, Integer> numbers = new HashMap<>();
        IntStream.rangeClosed(1, 100).forEach(element -> {
            Integer randomNumber = random.nextInt(201);
            if (numbers.containsKey(randomNumber)){
                numbers.put(randomNumber, numbers.get(randomNumber) + 1);
            }
            else{
                numbers.put(randomNumber, 1);
            }
        });
        System.out.println(numbers);
        List<Integer> nu = numbers.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(entry -> entry.getKey())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(nu);
    }


}


