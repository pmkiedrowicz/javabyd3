package com.sda.javabyd3.mizi.exg003.ex01;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        Zad1 zad1 = new Zad1();
        System.out.println("Podaj liczbe ");
        Integer number = scanner.nextInt();
        if(zad1.checkNumber( number )) {
            System.out.println("Liczba parzysta");
        }
        else{
            System.out.println("Liczba nieparzysta");
        }


    }
}
