package com.sda.javabyd3.daol.exg001.ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać liczbę nr 1: ");
        numbers.add(scanner.nextInt());
//        Integer one = scanner.nextInt();
        System.out.println("Proszę podać liczbę nr 2: ");
        numbers.add(scanner.nextInt());
//        Integer two = scanner.nextInt();
        System.out.println("Proszę podać liczbę nr 3: ");
        numbers.add(scanner.nextInt());
//        Integer three = scanner.nextInt();
        System.out.println(numbers);

//        Stream<Integer> stream = Arrays.stream(numbers);
        numbers.stream()
                .sorted((s1, s2) -> {
                    System.out.println(s1 + " " + s2);
                    return s1.compareTo(s2);

                });
        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));

        System.out.println("Suma liczb w liście (1): ");
        int suma = numbers.stream().mapToInt(s1 -> s1).sum();
        System.out.println(suma);
        System.out.println("Suma liczb w liście (2): ");
        int suma2 = 0;
        for (int i = 0; i < numbers.size(); i++) {
            suma2 = suma2 + numbers.get(i);
        }
        System.out.println(suma2);
    }
}
