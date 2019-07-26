package com.sda.javabyd3.mizi.exg007.Zad3;

/**
 * Created by Michal Ziolecki.
 */
public class Main3 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.sum( 1,2,3,4, 5);
        System.out.println("Sum of numbers fro varargs: " + sum);
    }
}
