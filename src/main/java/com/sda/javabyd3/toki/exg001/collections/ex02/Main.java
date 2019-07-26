package com.sda.javabyd3.toki.exg001.collections.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int numberOfRepeats = 10;

        System.out.println("Adding 10 random numbers to collection... \n");
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
//adding random numbers to collection
        for (int i = 0; i < numberOfRepeats; i++) {
            list.add(random.nextInt());
        }
//printing numbers from collection by using their index(added loop for not repeating code)
        System.out.println("Let me print them for U too!\n");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
