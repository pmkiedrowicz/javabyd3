package com.sda.javabyd3.daol.exg003.ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Palindrom palindrom = new Palindrom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst, aby sprawdzić czy jest palindromem: ");
        String text = scanner.nextLine();
        palindrom.deleteEmpytChar(text);
        System.out.println(palindrom.isPalindrom(text) ? "Tekst jest palindromem." : "Tekst nie jest palindromem.");

    }
}
//        System.out.println("podaj ciąg znaków: ");
//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.nextLine();
//        String string2 = string.replace(" ", "" );
//        String string3 = string2.toLowerCase();
//        char[] warray = string2.toCharArray();
//
//        Palindrom palindrom = new Palindrom();
//        System.out.println(palindrom.istPalindrom(warray));
//    }
//}
