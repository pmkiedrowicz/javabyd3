package com.sda.javabyd3.mizi.exg008.ex04;

import com.sda.javabyd3.mizi.exg008.ex03.NameValidator;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Podaj rejestracje");
        String inPut = scanner.nextLine();
        PlateValidator plateValidator= new PlateValidator();
        System.out.println(plateValidator.validate( inPut ));
    }
}
