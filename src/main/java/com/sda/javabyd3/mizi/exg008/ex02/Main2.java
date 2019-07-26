package com.sda.javabyd3.mizi.exg008.ex02;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Podaj numer ");
        String inPut = scanner.nextLine();
        TelephoneValidator2 telephoneValidator = new TelephoneValidator2();
        System.out.println(telephoneValidator.validate( inPut ));
    }
}
