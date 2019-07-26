package com.sda.javabyd3.mabr.zadania007;

public class MainAddNumbers {
    public static void main(String[] args) {
        AddNumbers addNumbers = new AddNumbers();
        int sum = addNumbers.addNumbers(1, 2, 3, 4, 5);
        System.out.println("Sum of numbers fro varargs: " + sum);
    }
}
