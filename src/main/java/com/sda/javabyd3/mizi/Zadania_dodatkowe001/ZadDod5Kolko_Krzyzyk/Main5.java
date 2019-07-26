package com.sda.javabyd3.mizi.Zadania_dodatkowe001.ZadDod5Kolko_Krzyzyk;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println(" Podaj wymiar planszy :) - dlugo jednego boku: ");
        Integer size = scanner.nextInt();
        CircleAndCross circleAndCross = new CircleAndCross( size );
        circleAndCross.mainLoopGame();
    }
}
