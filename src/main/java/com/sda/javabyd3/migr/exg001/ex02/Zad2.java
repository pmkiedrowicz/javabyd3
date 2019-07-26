package com.sda.javabyd3.migr.exg001.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {


        Scanner numList = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int liczba;

        while ((liczba = numList.nextInt()) != 666) {
            list.add(liczba);
            System.out.println("podales " + liczba);
        }

        int min = list.get(0);
        int max = list.get(0);

        for (Integer i : list) {
            if (i > min) min = i;
            if (i < max) max = i;
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);

    }
}