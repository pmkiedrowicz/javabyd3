package com.sda.javabyd3.urdu.exg011.ex01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanNumber = new Scanner(System.in);
        Function function = new Function();
        double a = 0;
        double b, c;

        System.out.println("Program do rozwiązywania równania: ax2 + bx + c = 0");

        do {
            System.out.println("Podaj wartość a: ");
            a=scanNumber.nextDouble();
                if(a==0){
                    System.out.println("Wartość musi być różna od 0. Wprowadź ponownie.");
                }
        } while ((a == 0));

        System.out.println("Podaj wartość b: ");
        b= scanNumber.nextDouble();

        System.out.println("Podaj wartość c: ");
        c= scanNumber.nextDouble();

        System.out.println(function.equationSolution(a,b,c));
    }
}
