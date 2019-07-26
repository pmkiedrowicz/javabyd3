package com.sda.javabyd3.syga.exg001.Ogolne.ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumber = new ArrayList();
        Random random = new Random();
        random.nextInt();

        for (int i = 0; i < 20; i++) {
            int number = random.nextInt(100);
            if (listOfNumber.contains(number)){
                i--;
            }else{
                listOfNumber.add(number);
            }

        }

        Collections.sort(listOfNumber);
        System.out.println(listOfNumber);
    }
}
