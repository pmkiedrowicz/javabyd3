package com.sda.javabyd3.toki.exg007oop.ex02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Reader reader = new Reader();
        reader.getNumbersFromUser(list);

        System.out.println(list);
    }
}