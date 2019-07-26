package com.sda.javabyd3.mizi.exg009.ex01;

import com.sda.javabyd3.lusi.introduction.TextColor;
import com.sda.javabyd3.lusi.introduction.Utils;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Podaj liczbe od 0 do 99: ");
        int number = scanner.nextInt();
        NumberConverter numberConverter = new NumberConverter();
        Utils.displayTextOnConsole(number + " = " + numberConverter.convertToString( number ), TextColor.ANSI_GREEN);
        System.out.println("Slownie to: " + numberConverter.convertToString( number ));
    }
}
