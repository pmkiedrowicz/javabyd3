package com.sda.javabyd3.toki.exg0011.ex02;

import java.util.Arrays;
import java.util.HashMap;

public class CountingSort {
    public CountingSort() {
    }

    public HashMap countIt(int[] tab) {

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        int max = Arrays.stream(tab).max().getAsInt();
        int min = Arrays.stream(tab).min().getAsInt();

        HashMap hashMap = new HashMap();
        for (int i = 0; i <= max; i++) {
            hashMap.put(i, 0);
        }


        for (int i = 0; i < tab.length; i++) {
            if (hashMap.containsKey(tab[i])) {
                int temp;
                temp = (int) hashMap.get(tab[i]);
                temp += 1;
                hashMap.replace(tab[i], temp);
            }
        }
        System.out.println(hashMap);
        return hashMap;
    }
}