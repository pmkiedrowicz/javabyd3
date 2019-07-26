package com.sda.javabyd3.kawa.exg003.ogolne.ex01;

import java.util.Scanner;

public class ScannerOfThings {

    public String text;
    public int numb;
    Scanner scanner = new Scanner(System.in);

    public int scanningNumb() {
        System.out.println("Podaj liczbe calkowita:");
        numb = scanner.nextInt();
        return numb;
    }

    public String scanText(){
        System.out.println("Podaj text: ");
        text = scanner.nextLine();
        return text;
    }

}
