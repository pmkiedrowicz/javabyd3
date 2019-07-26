package com.sda.javabyd3.mizi.exg003.ex04;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        //Zad4 zad4 = new Zad4();
        Zad4v2 zad4v2 = new Zad4v2();
        System.out.println("Podaj zdanie: ");
       // System.out.println("Zwrotka: " + zad4.toEngCharacters( scanner.nextLine() ));
        System.out.println("Zwrotka: " + zad4v2.changeCharacters( scanner.nextLine() ));
    }
}
