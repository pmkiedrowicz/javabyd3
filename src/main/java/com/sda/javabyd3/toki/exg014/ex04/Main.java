package com.sda.javabyd3.toki.exg014.ex04;

import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
Fibonacci fibonacci=new Fibonacci();

        System.out.print("Type a no of Fibonacci progression: ");
        int n=scanner.nextInt();

        System.out.print("The answer is: "+fibonacci.fibbonaci(n));

    }
}
