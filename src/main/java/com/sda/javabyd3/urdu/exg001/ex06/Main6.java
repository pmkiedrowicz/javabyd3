package com.sda.javabyd3.urdu.exg001.ex06;

import java.util.*;

public class Main6 {

    public static void main(String[] args) {

        Random r = new Random();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {

            numbers.add(r.nextInt(1001) + 1000);
        }
        //System.out.println(numbers);

        Optional<Integer> max = numbers.stream().max((num1, num2) -> num1.compareTo(num2));
        System.out.println("Najwięszka liczba to "+ max.get());

        Optional<Integer> min = numbers.stream().min(Comparator.naturalOrder());
        System.out.println("Najmniejsza liczba to "+ min.get());
    }

}
