package com.sda.javabyd3.mizi.exg008.ex08;

import com.sda.javabyd3.mizi.exg008.ex07.IPValidator;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Podaj haslo: ");
        String inPut =  "AA12c%c.2";
        PasswordValidator passwordValidator = new PasswordValidator();
        System.out.println(passwordValidator.validate( inPut ));
    }
}
