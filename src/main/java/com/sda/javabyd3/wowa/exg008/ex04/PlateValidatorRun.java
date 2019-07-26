//Przygotuj aplikację sprawdzającą czy podany numer tablicy rejestracyjnej jest
//poprawny. Przygotuj klasę o nazwie PlateValidator posiadającą metodę
//public boolean validate(String plate);
//Na potrzeby zadania przyjmij, że tablica rejestracyjną jest poprawna gdy zawiera 2
//litery, a następnie 5 cyfr lub 4 cyfry i jedna litery lub 3 cyfry i 2 litery.
//Poprawny numer tablicy rejestracyjnej to: CB3456J, CB34212, WY640WI
//Błędny numer tablicy rejestracyjnej to: CBS3456, W1234YU, CC14WYG

package com.sda.javabyd3.wowa.exg008.ex04;

import java.util.Scanner;

public class PlateValidatorRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a plate number: ");
        String usersPlate = sc.nextLine();

        PlateValidator nv = new PlateValidator();
        boolean correctPlate = nv.validate(usersPlate);

        if (correctPlate) {
            System.out.println("correct plate");
        } else {
            System.out.println("incorrect plate");
        }
        sc.close();
    }
}
