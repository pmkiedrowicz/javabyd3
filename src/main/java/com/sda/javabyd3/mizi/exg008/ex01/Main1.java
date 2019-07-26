package com.sda.javabyd3.mizi.exg008.ex01;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Podaj numer ");
        String inPut = scanner.nextLine();
        TelephoneValidator telephoneValidator = new TelephoneValidator();
        System.out.println(telephoneValidator.validate( inPut ));
    }
}
