package com.sda.javabyd3.toki.exg001.general.ex05;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 200; i++) {
            list.add(random.nextInt(200));
        }
        System.out.println(list);

        Set checkRepeats=new HashSet();
        checkRepeats.add(list);



        System.out.println(checkRepeats);

    }
}
