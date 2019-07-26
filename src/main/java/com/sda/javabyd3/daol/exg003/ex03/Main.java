package com.sda.javabyd3.daol.exg003.ex03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("podaj ciąg znaków: ");
//        String string = scanner.nextLine();
//        String reverse = new StringBuffer(string).
//                reverse().toString();
//        System.out.println("\nCiąg znaków przed zamianą: " + string);
//        System.out.println("Ciąg znaków po zamianie: " + reverse);
//    }
        InversChecker inversChecker = new InversChecker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków: ");
        String word = scanner.nextLine();
        System.out.println(inversChecker.wordInvers(word));
    }
}