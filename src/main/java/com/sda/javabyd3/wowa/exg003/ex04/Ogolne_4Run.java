//Napisz program, który pobiera od użytkownika wyraz lub zdanie i usuwa z niego
//polskie znaki diakrytyczne. Przykładowo zdanie “Zażółć gęślą jaźń” zostanie
//zamienione na “Zazolc gesla jazn”.

package com.sda.javabyd3.wowa.exg003.ex04;

import java.util.Scanner;

public class Ogolne_4Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Text to remove polish accents: ");
        String text;
        text = sc.nextLine();

        Ogolne_4 zad4 = new Ogolne_4();
        System.out.println(zad4.removeAccents(text));
    }
}
