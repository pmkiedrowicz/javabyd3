package com.sda.javabyd3.toki.exg014.ex03;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Main {

    public static void main(String[] args) {

        long number = 20;
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(number));
    }
}
