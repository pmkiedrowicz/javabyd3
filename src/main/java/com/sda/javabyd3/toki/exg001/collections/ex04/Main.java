package com.sda.javabyd3.toki.exg001.collections.ex04;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int numberOfNames = 10;
        //using collection Set for not-repeating pattern
        Set set = new HashSet();
        for (int i = 0; i < numberOfNames; i++) {
            Scanner scanner = new Scanner(System.in);
            set.add(scanner.next());
        }
        System.out.println(set);
    }
}
