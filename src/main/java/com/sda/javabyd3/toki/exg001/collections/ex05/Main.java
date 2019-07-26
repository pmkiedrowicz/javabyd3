package com.sda.javabyd3.toki.exg001.collections.ex05;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfRepeats = 10;
        Queue<String> que = new ArrayDeque<>();
        for (int i = 0; i < numberOfRepeats; i++) {
            int z = i + 1;
            System.out.println("Podaj zadanie " + z + " do wykonania: ");
            que.add(scanner.nextLine());
        }
        System.out.println(que);
    }
}
