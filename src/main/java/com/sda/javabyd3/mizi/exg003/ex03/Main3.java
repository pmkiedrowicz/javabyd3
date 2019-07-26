package com.sda.javabyd3.mizi.exg003.ex03;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        Zad3 zad3 = new Zad3();
        System.out.println("Podaj sentencje");
        String sentence = scanner.nextLine();
        System.out.println("Revers: " + zad3.reverseString( sentence ));
    }
}
