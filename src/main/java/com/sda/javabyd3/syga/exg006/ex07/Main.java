package com.sda.javabyd3.syga.exg006.ex07;

import java.util.Scanner;

public class Main implements Logger{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String name = scanner.nextLine();
        System.out.println(name);
        //log.info(name);
    }

    @Override
    public void log(String message) {

    }
}
