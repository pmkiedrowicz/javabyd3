//Napisz program, który umożliwi użytkownikowi wpisanie dowolnej liczby całkowitej z
//zakresu [1-99], po czym wyświetli ją w konsoli w postaci słownej. Np. 23 ->
//dwadzieścia trzy

package com.sda.javabyd3.wowa.exg009.ex01;

import java.util.Scanner;

public class NumberConverterRun
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj liczbe: ");
        int number = scanner.nextInt();
        String numberAsText = new NumberConverter().convertToString(number);
        System.out.println();
        System.out.println(number + " " + numberAsText);
    }
}
