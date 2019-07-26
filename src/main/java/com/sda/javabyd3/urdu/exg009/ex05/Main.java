package com.sda.javabyd3.urdu.exg009.ex05;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws  Exception{

        Calculator calc = new Calculator();
        Converter converter = new Converter();
        Scanner scanText = new Scanner(System.in);
        System.out.println("Wprowadź wyrażenie do obliczenia: (na przykład 2+6 lub 4^3)");
        String text = scanText.next();

        System.out.println("Wyliczona wartość to: " + converter.convertTextToEqu(text));

        /**
        String proba = "4+8";
        String proba1 = "12-8";
        String proba2 = "4*8";
        String proba3 = "4/8";
        String proba4 = "4^3";

        System.out.println(converter.convertTextToEqu(proba));
        System.out.println(converter.convertTextToEqu(proba1));
        System.out.println(converter.convertTextToEqu(proba2));
        System.out.println(converter.convertTextToEqu(proba3));
        System.out.println(converter.convertTextToEqu(proba4));
        **/
    }
}
