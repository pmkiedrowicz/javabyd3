package com.sda.javabyd3.toki.exg001.general.ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(random.nextInt(1001) + 1000);
        }
        System.out.println(list);

        List<Integer> checker = list.stream()
                .sorted((e1, e2) -> e1.compareTo(e2))
                .collect(Collectors.toList());
        System.out.println(checker.get(0));
        System.out.println(checker.get(999));

    }
}
