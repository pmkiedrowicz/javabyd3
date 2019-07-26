package com.sda.javabyd3.mabr.zadania007;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetNumbers {
    public List<Integer> getNumbersFromUser() {
        List<Integer> listOfNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj liczbę do zapamietania: ");
            String inPut = scanner.nextLine();
            if (inPut.equals("c")) {
                break;
            } else {
                Integer number = Integer.parseInt(inPut);
                listOfNumbers.add(number);
            }
        }
        return listOfNumbers;
    }
}
