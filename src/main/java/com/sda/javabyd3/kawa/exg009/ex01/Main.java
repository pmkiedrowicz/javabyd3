package com.sda.javabyd3.kawa.exg009.ex01;

import com.sda.javabyd3.lusi.introduction.TextColor;
import com.sda.javabyd3.lusi.introduction.Utils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe z zakresu od 1 do 99:");
        int numb = scanner.nextInt();

        NumberConverter numberConverter = new NumberConverter();
        Utils.displayTextOnConsole(numb + " -> " + numberConverter.converToString(numb), TextColor.ANSI_CYAN);
    }
}
