package com.sda.javabyd3.mizi.exg007.Zad2;

import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class Main2 {
    public static void main(String[] args) {
        GetNumbers getNumbers = new GetNumbers();
        List<Integer> listOfNumbersMain = getNumbers.getNumbersFromUsers();
        System.out.println("Your list of numbers: ");
        for(Integer element: listOfNumbersMain)
        {
            System.out.print(" " + element);
        }
    }
}
