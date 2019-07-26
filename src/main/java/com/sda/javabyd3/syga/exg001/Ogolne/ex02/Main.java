package com.sda.javabyd3.syga.exg001.Ogolne.ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNum = new ArrayList<Integer>();

        int sum = 0;
        String koniec = "koniec";
        System.out.println("Podaj dowolną ilość liczb(oddzielaj Enterem), aby zakończyć wpisz koniec:");
        Scanner keybord = new Scanner(System.in);

        while (true) {
            String addNum = keybord.next();
            if (addNum.equals(koniec))
                break;
            else listOfNum.add(Integer.valueOf(addNum));
        }

        for (int i = 0; i < listOfNum.size(); i++) {
            sum += listOfNum.get(i);
        }

        Collections.sort(listOfNum);
        System.out.println("Największa liczba to: " + listOfNum.get(listOfNum.size() - 1));
        System.out.println("Najmniejsza liczba to: " + listOfNum.get(0));
        System.out.println("Suma podanych liczb: " + sum);

    }
}
