package com.sda.javabyd3.mizi.exg003.ex02;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        Zad2 zad2 = new Zad2();
        System.out.println("Podaj liczbe ");
        Integer number = scanner.nextInt();
        boolean status = zad2.test(number);

        if(status) System.out.println("Liczba jest pierwsza");
        else System.out.println("Liczba nie jest pierwsza");

    }
}
