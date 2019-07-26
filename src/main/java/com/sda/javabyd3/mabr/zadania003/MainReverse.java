package com.sda.javabyd3.mabr.zadania003;

import java.util.Scanner;

public class MainReverse {

    public static void main(String[] args) {

        String input;
        Scanner read = new Scanner(System.in);
        input = read.nextLine();
        System.out.println(input);

        Reverse zad3 = new Reverse();
        System.out.println(Reverse.Revers(input));
    }
}
