package com.sda.javabyd3.mizi.exg008.ex06;

import com.sda.javabyd3.mizi.exg008.ex05.WebValidator;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Podaj email");
        String inPut = scanner.nextLine();
        EmailValidator emailValidator= new EmailValidator();
        System.out.println(emailValidator.validate( inPut ));
    }
}
