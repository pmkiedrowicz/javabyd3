package com.sda.javabyd3.wowa.exg001.Ogolne.ex01;

import java.util.Scanner;

public class Ogolne_1Run {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbe 1(inta): ");
        int x1 = sc.nextInt();
        System.out.println("podaj liczbe 2(inta): ");
        int x2 = sc.nextInt();
        System.out.println("podaj liczbe 3(inta): ");
        int x3 = sc.nextInt();

        Ogolne_1 ogol1 = new Ogolne_1();
        ogol1.najwiekszaINajmniejsza(x1, x2, x3);
        System.out.println("suma liczb: " + ogol1.suma(x1, x2, x3));

        sc.close();
    }
}
