package com.sda.javabyd3.urdu.exg007.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetNumbers {

    public List<Integer> getNumbersFromUser() {

        List<Integer> listOfNumbers = new ArrayList<>();
        Scanner scanNumber = new Scanner(System.in);
        String check = "";
        int temp;
        do {
            System.out.println("Podaj liczbę. By zakończyć podawanie wpisz: 'c' ");
            check = scanNumber.nextLine();
            if (!check.equals("c")) {
                temp = Integer.parseInt(check);
                listOfNumbers.add(temp);
            }
        } while (!check.equals("c"));

        return listOfNumbers;
    }
}
