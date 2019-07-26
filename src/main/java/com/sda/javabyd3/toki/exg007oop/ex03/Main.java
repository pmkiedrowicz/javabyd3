package com.sda.javabyd3.toki.exg007oop.ex03;

public class Main {
    public static void main(String[] args) {
        Adds adds = new Adds();
        Integer sum = adds.summedNumbers(321, 43, 321, 321, 412);
        System.out.println("The sum of varargs: " + sum);
    }
}
