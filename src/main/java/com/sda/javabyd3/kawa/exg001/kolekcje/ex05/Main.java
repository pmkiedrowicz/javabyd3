package com.sda.javabyd3.kawa.exg001.kolekcje.ex05;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> requestList = new ArrayDeque<>();
        for (int i = 1; i < 11; i++) {
            requestList.add("request" + String.valueOf(i));
        }
        int sizeOfQue = requestList.size();
        for (int j = 0; j < sizeOfQue; j++) {
            System.out.println("Zadanie " + String.valueOf(j + 1) + " w kolejnosci do zrobienia to zadanie " +
                    requestList
                    .poll());
        }
    }
}
