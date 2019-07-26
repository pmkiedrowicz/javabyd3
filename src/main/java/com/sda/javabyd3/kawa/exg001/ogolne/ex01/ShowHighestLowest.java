package com.sda.javabyd3.kawa.exg001.ogolne.ex01;

public class ShowHighestLowest {

    private int sumaLiczb;

    public void showHighest(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Liczba " + firstNumber + " is the greatest.");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Liczba " + secondNumber + " is the greatest.");
        } else {
            System.out.println("Liczba " + thirdNumber + " is the greatest." );
        }
    }

    public void showLowest (int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            System.out.println("Liczba " + firstNumber + " is the lowest.");
        } else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
            System.out.println("Liczba " + secondNumber + " is the lowest.");
        } else {
            System.out.println("Liczba " + thirdNumber + " is the lowest.");
        }
    }

    public void sumAllNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        sumaLiczb = firstNumber + secondNumber + thirdNumber;
        System.out.println("Suma trzech wprowadzonych liczb wynosi: " + sumaLiczb);
    }
}
