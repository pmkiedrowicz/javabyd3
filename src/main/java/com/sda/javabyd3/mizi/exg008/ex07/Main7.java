package com.sda.javabyd3.mizi.exg008.ex07;

import com.sda.javabyd3.mizi.exg008.ex06.EmailValidator;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Podaj ip: ");
        String inPut = scanner.nextLine();
        IPValidator ipValidator= new IPValidator();
        System.out.println(ipValidator.validate( inPut ));
    }
}
