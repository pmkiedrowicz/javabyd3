package com.sda.javabyd3.kawa.exg007.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class NumbersFromUserGetter {

    public List<Integer> getNumbersFromUser() {
        List<Integer> listToReturn = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String numberFromUser;
        Pattern pattern = Pattern.compile("[0-9]+");
        do {
            System.out.println("Podaj liczbe lub zakoncz podawanie litera 'c' : ");
            numberFromUser = scanner.nextLine();
            if (numberFromUser.equals("c")) {
                break;
            } else if (pattern.matcher(numberFromUser).matches()) {
                listToReturn.add(Integer.parseInt(numberFromUser));
            } else {
                System.out.println("Podany znank nie jest liczba");
            }
        } while (true);
        return listToReturn;
    }

    public void ListOfNumbersPrinter(List<Integer> args) {
        System.out.println("Kolejno wprowadzone liczby to: ");
        for (int item : args) {
            System.out.print(item + " , ");
        }
    }
}
