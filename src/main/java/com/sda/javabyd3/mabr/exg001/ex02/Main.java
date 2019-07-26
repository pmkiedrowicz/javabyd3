package com.sda.javabyd3.mabr.exg001.ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ile parametrow ");
        int ile;
        Scanner odczyt = new Scanner(System.in);
        ile = odczyt.nextInt();


        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < ile; i++) {


            Integer number;
            Scanner read = new Scanner(System.in);
            number = read.nextInt();

            l.add(number);

            System.out.println(l);
            System.out.println("Max " + Collections.max(l));
            System.out.println("Min " + Collections.min(l));

            int sum = 0;
            for (Integer p : l)
                sum = sum + p;

            System.out.println("Suma " + sum);

        }

    }


}

