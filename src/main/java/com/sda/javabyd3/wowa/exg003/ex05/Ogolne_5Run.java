//Napisz program, który pobiera od użytkownika wyraz lub zdanie i sprawdza czy
//wprowadzony ciąg znaków jest palindromem. Przykładowy palindrom to “kajak” lub
//“Może jutro ta dama da tortu jeżom”. Program po analizie wyświetla komunikat:
//Wprowadzony ciąg znaków “<wprowadzone_znaki>” jest palindromem
//lub Wprowadzony ciąg znaków “<wprowadzone_znaki>” nie jest palindromem

package com.sda.javabyd3.wowa.exg003.ex05;

import java.util.Scanner;

public class Ogolne_5Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wprowadz tekst do sprawdzenia czy jest palindromem (np kajak): ");
        String text = sc.nextLine();

        Ogolne_5 zad5 = new Ogolne_5();
        Boolean result = zad5.palindrome(text);
        if (result) {
            System.out.println("Wprowadzony ciag znakow \"" + text + "\" jest palindromem");
        } else {
            System.out.println("Wprowadzony ciag znakow \"" + text + "\" nie jest palindromem");
        }
        sc.close();
    }
}
