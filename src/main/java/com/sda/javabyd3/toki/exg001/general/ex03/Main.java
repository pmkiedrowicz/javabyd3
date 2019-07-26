package com.sda.javabyd3.toki.exg001.general.ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> listOfNum = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            // to check int number = random.nextInt(100);
            int number = random.nextInt();
            if (listOfNum.contains(number)) {
                i--;
            } else {
                listOfNum.add(random.nextInt());
            }
        }
        Collections.sort(listOfNum);
        for (int k = 0; k < listOfNum.size(); k++) {
            System.out.println(listOfNum.get(k));
        }
    }
}
