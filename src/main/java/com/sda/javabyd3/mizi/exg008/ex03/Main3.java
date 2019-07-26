package com.sda.javabyd3.mizi.exg008.ex03;

import com.sda.javabyd3.mizi.exg008.ex02.TelephoneValidator2;

import java.util.Scanner;

/**
 * Created by Michal Ziolecki.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Podaj imie");
        String inPut = scanner.nextLine();
        NameValidator nameValidator = new NameValidator();
        System.out.println(nameValidator.validate( inPut ));
    }
}
