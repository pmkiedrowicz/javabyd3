package com.sda.javabyd3.toki.exg001.general.ex02;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> listOfNum = new ArrayList<>();

        int sum = 0;
        String koniec="koniec";

        System.out.println("Podaj dowolną ilość liczb(oddzielaj Enterem)");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String addNum = scanner.next();
            if (addNum.equals(koniec))
                break;
            else listOfNum.add(Integer.valueOf(addNum));
        }

        for (int i = 0; i < listOfNum.size(); i++) {
            sum += listOfNum.get(i);
        }

        Collections.sort(listOfNum);
        System.out.println("Największa liczba to: " + listOfNum.get(listOfNum.size()-1));
        System.out.println("Najmniejsza liczba to: " + listOfNum.get(0));
        System.out.println("Suma podanych liczb: " + sum);

    }
}