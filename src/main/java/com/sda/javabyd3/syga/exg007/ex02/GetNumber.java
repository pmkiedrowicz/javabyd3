package com.sda.javabyd3.syga.exg007.ex02;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GetNumber {
    public GetNumber() {
    }

    public List<Integer> getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        Integer number = 0;

        System.out.println("Enter the number: ");


        number = scanner.nextInt();
        getNumberFromUser().add(number);


        return getNumberFromUser();
    }
}
