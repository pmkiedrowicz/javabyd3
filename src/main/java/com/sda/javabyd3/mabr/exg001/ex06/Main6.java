package com.sda.javabyd3.mabr.exg001.ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main6 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        for (int i = 1; i < 1001; i++) {

            Random rand = new Random();
            int a = rand.nextInt(1001) + 1000;
            lista.add(a);
        }
        System.out.println(lista);

        int min = lista.stream().reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println("Najmniejsza wartość; " + min);
        int max = lista.stream().reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("Najwieksza wartość; " + max);
    }
}




