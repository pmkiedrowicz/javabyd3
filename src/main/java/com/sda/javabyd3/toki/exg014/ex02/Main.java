package com.sda.javabyd3.toki.exg014.ex02;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Backwarder backwarder = new Backwarder();
        int number = scanner.nextInt();

        System.out.println(backwarder.addThemAll(number));

    }
}
