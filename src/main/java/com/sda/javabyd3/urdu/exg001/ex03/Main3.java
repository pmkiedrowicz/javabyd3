package com.sda.javabyd3.urdu.exg001.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main3 {

    public static void main(String[] args) {

        Random r = new Random();
        int number;
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; numbers.size() < 20; i++) {

            number = (r.nextInt(100) + 1);
            if (numbers.contains(number)) {
                System.out.println("Wartość powtórzona");

            } else {
                numbers.add(number);
            }
        }

        System.out.println("Koniec losowania, lista to : " + numbers);
    }

}
