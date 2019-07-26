package com.sda.javabyd3.syga.exg007.ex03;

import java.util.Scanner;

public class AddingAndSum {
    public Integer AddAndSum() {
        Integer number = 0;
        Integer result = number;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        String end = "";

        while (!end.equals("yes")) {
            System.out.println("Enter the number: ");
            number = scanner.nextInt();
            result += number;
            System.out.println("Sum = " + result + "\n");
            System.out.println("Do you want end? yes or no.");
            end = scanner1.nextLine();
            System.out.println("");
            if (end.equals("yes")){
                System.out.println("Ending the program.");
            }
        }

        return result;
    }
}
