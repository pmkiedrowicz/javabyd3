package com.sda.javabyd3.jaja.exg007.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetNumber {

    public List<Integer> getNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        String end = scanner.nextLine();
        if (end.equals("c")) {
            System.out.println("Koniec");
        }
        Integer number = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(number);
        return getNumbersFromUser();
    }
}

