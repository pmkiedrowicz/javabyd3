package com.sda.javabyd3.toki.exg009general.ex01;

import com.sda.javabyd3.lusi.introduction.Utils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type an integer in range [1-99]");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        NumberConverter numberConverter = new NumberConverter();
        Utils.displayTextOnConsole(number + " = " + numberConverter.convertToString(number));

    }
}
