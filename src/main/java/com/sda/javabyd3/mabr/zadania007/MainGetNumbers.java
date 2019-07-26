package com.sda.javabyd3.mabr.zadania007;

import java.util.List;

public class MainGetNumbers {
    public static void main(String[] args) {
        GetNumbers getNumbers = new GetNumbers();
        List<Integer> listOfNumbersMain = getNumbers.getNumbersFromUser();
        System.out.println("Your list of numbers: ");
        for (Integer element : listOfNumbersMain) {
            System.out.print(" " + element);
        }
    }
}
