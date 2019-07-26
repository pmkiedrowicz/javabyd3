package com.sda.javabyd3.toki.exg008regex.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Plate number: ");
        String plate=scanner.nextLine();

        PlateValidator plateValidator=new PlateValidator();
        System.out.println(plateValidator.validate(plate));
        scanner.close();
    }
}
