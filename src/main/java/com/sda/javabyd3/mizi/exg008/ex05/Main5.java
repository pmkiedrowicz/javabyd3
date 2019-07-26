package com.sda.javabyd3.mizi.exg008.ex05;

import com.sda.javabyd3.mizi.exg008.ex04.PlateValidator;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Podaj www");
        String inPut = scanner.nextLine();
        WebValidator webValidator= new WebValidator();
        System.out.println(webValidator.validate( inPut ));
    }
}
