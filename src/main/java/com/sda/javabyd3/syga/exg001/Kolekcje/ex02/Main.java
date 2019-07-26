package com.sda.javabyd3.syga.exg001.Kolekcje.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random generateNumber = new Random();
        List<Integer> listOfNumber = new ArrayList<>();
        int number = 0;
        for (int i = 0; i < 10; i++) {
            number = generateNumber.nextInt(100);
            listOfNumber.add(number);
            System.out.println("Numer o indeksie [" + i +"] = " + number);
        }
    }
}
