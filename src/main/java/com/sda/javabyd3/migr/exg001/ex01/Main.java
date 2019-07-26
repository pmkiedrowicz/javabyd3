package com.sda.javabyd3.migr.exg001.ex01;


import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        System.out.println("podaj  liczby!");


        Scanner odczyt = new Scanner(System.in);
        int liczba1 = odczyt.nextInt();
        System.out.println("Witaj, podałeś: "+ liczba1);
        int liczba2 = odczyt.nextInt();
        System.out.println("Witaj, podałeś: "+ liczba2);
        int liczba3 = odczyt.nextInt();
        System.out.println("Witaj, podałeś: "+ liczba3);

        BiggestSmallest licznik = new BiggestSmallest();
        licznik.bigestSmallest(liczba1,liczba2,liczba3);



    }
}
