package com.sda.javabyd3.urdu.exg009.ex01;

import com.sda.javabyd3.urdu.exg009.TextColor;
import com.sda.javabyd3.urdu.exg009.Utils;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        NumberConverter numberConverter = new NumberConverter();
        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Podaj liczbę od 1 do 99");
        int number = scanNumber.nextInt();
        System.out.println(numberConverter.convertToString(number));

        //drugi sposób:

        String numberAsText = new NumberConverter().convertToString(number);
        System.out.println();
        Utils.displayTextOnConsole(number + " " + numberAsText, TextColor.ANSI_BLUE);


        boolean check = true;

//        do {
//            System.out.println("Podaj liczbę od 1 do 99");
//            number = scanNumber.nextInt();
//              if(number>=1 && <=99){
//
//            }
//
//        } while(!check==true);


    }
}
