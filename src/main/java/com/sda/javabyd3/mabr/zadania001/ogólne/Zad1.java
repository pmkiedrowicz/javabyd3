package com.sda.javabyd3.mabr.zadania001.ogólne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfNumber = new ArrayList<>();
        int counter = 1;
        System.out.println("Podaj trzy liczby");
        while (counter < 4) {
            System.out.println("liczba " + counter + ":");
            String inPut = scanner.nextLine();
            Pattern pattern = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher(inPut);
            if (matcher.matches()) {
                Integer inPutNumber = Integer.parseInt(inPut);
                listOfNumber.add(inPutNumber);
                counter++;
            } else System.out.println("To nie byla liczba - podaj liczbe ponownie.");
        }
        listOfNumber.sort(Integer::compareTo);
        System.out.println("Najmniejsza liczba to: " + listOfNumber.get(0));
        System.out.println("Najwieksza liczba to: " + listOfNumber.get(listOfNumber.size() - 1));
        System.out.print("Suma liczb to: ");
        Integer sum = 0;
        for (Integer item : listOfNumber) {
            sum += item;
        }
        System.out.println(sum);
    }
}
