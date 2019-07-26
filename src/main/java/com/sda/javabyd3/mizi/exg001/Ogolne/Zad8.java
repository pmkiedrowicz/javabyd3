package com.sda.javabyd3.mizi.exg001.Ogolne;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Zad8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        Integer inPut;
        System.out.println("podaj cyfre");
        // nie weryfikuje wejscia z lenistwa :D
        inPut = scanner.nextInt();
        switch (inPut)
        {
            case 0:
                System.out.println(EnumOfWords.ZERO);
                break;
            case 1:
                System.out.println(EnumOfWords.JEDEN);
                break;
            case 2:
                System.out.println(EnumOfWords.DWA);
                break;
            case 3:
                System.out.println(EnumOfWords.TRZY);
                break;
            case 4:
                System.out.println(EnumOfWords.CZTERY);
                break;
            case 5:
                System.out.println(EnumOfWords.PIEC);
                break;
            case 6:
                System.out.println(EnumOfWords.SZESC);
                break;
            case 7:
                System.out.println(EnumOfWords.SIEDEM);
                break;
            case 8:
                System.out.println(EnumOfWords.OSIEM);
                break;
            case 9:
                System.out.println(EnumOfWords.DZIEWIEC);
                break;
        }
    }
}
