package com.sda.javabyd3.daol.exg001.ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        int sum = 0;
        boolean end = false;
        int control;
        Scanner scanNumber = new Scanner(System.in);

        System.out.println("Podaj liczby , 0 kończy wprowadzanie");

        while (!end) {
            System.out.println("Podaj liczbę: ");
            control = scanNumber.nextInt();

            if (control == 0) {
                end = true;
                System.out.println("koniec ");
            } else {
                numbers.add(control);
            }
        }
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
        for (int i = 0; i < numbers.size(); i++ ) {
            suma2 = suma2 + numbers.get(i);
        }
        System.out.println(suma2);
    }
}
