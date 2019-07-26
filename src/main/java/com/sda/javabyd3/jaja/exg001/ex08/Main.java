package com.sda.javabyd3.jaja.exg001.ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Integer counter = 0;

        List<Integer> numbers = new ArrayList<>();
        while (counter < 10) {
            Random random = new Random();
            int i = random.nextInt(100);
            numbers.add(i);
            System.out.println("indeks " + counter + ": " + numbers.get(counter));
            counter++;
        }
    }
}
