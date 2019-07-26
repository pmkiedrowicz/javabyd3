package com.sda.javabyd3.jaja.exg001.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size()<=20) {
            Random random = new Random();
            i = (random.nextInt(100)+1);
            if (numbers.contains(i)){

            }else {
                numbers.add(i);
            } }
        System.out.println(numbers);
    }
}

