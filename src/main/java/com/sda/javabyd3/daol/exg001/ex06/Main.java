package com.sda.javabyd3.daol.exg001.ex06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Integer counter = 0;
        List<Integer> numbers = new ArrayList<>();
        while (counter < 1000) {
            Random random = new Random();
            int i = (random.nextInt(1001) + 1000);
            numbers.add(i);
            counter++;
        }
        System.out.println(numbers);
        Integer min = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min.: " + min);
        Integer max = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max.: " + max);
    }

}
