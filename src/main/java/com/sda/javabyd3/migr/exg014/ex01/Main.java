package com.sda.javabyd3.migr.exg014.ex01;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String word = scanner.nextLine();

        long time1 = System.nanoTime();
        System.out.println(backwords(word, word.length() - 1));
        long time2 = System.nanoTime();
        System.out.println(time2-time1);

        long time3 = System.nanoTime();
        System.out.println(new StringBuilder(word).reverse().toString());
        long time4 = System.nanoTime();
        System.out.println(time4-time3);
    }


    public static String backwords(String word, int lenght) {
        if (lenght >= 0) {
            return word.charAt(lenght) + backwords(word, lenght - 1);
        }
        return "";
    }
}
