package com.sda.javabyd3.urdu.exg003zadaniaOgolne;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        ParityChecker met1 = new ParityChecker();
        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number=scanNumber.nextInt();

        System.out.println(met1.checkParity(number)?"Liczba jest parzysta":"Liczba jest nieparzysta");

    }

}
