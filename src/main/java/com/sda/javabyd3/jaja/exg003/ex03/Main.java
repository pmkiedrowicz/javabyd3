package com.sda.javabyd3.jaja.exg003.ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ReversWord reversWord = new ReversWord();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków: ");
        String word = scanner.nextLine();
        System.out.println(reversWord.wordInvers(word));

    }
}

