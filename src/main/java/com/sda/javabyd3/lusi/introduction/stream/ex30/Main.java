package com.sda.javabyd3.lusi.introduction.stream.ex30;

import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;

import static java.lang.System.out;

public class Main {
    private static Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        HashSet<Integer> lotto = new HashSet<>();
        IntStream.rangeClosed(0, 5).forEach(i -> {
            do {
            } while (!lotto.add(random.nextInt(49) + 1));
        });
        lotto.stream().forEach(out::println);
    }
}
