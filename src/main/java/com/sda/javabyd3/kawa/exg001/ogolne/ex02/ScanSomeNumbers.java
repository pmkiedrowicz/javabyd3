package com.sda.javabyd3.kawa.exg001.ogolne.ex02;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanSomeNumbers {

    ArrayList<Integer> listaLiczb = new ArrayList();

    public void scan() {
        boolean valid = false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj liczbe, badz zakoncz podawanie liczb innym znakiem: ");
                listaLiczb.add(scanner.nextInt());

            } catch (InputMismatchException e) {
                System.out.println("Podano znak inny jak liczba, zakonczono pobieranie wartosci liczbowych!");
                valid = true;
            }
        } while (!valid);
    }
}
