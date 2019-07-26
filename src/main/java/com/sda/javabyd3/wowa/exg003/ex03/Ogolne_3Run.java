//Napisz program, który pobiera od użytkownika wyraz lub zdanie i tworzy z niego
//odwrotność. Dla słowa “grzegżółka” program zwraca “akłóżgezrg”.

package com.sda.javabyd3.wowa.exg003.ex03;

import java.util.Scanner;

public class Ogolne_3Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Text to reverse: ");
        String text;
        text = sc.nextLine();

        Ogolne_3 zad3 = new Ogolne_3();
        System.out.println(zad3.reverseString(text));

        sc.close();
    }
}
