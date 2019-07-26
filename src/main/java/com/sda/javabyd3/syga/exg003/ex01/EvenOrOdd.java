package com.sda.javabyd3.syga.exg003.ex01;

public class EvenOrOdd {


    public Boolean check(Integer number) {

        if (number%2 == 0){
            System.out.println("Liczba jest parzysta");
            return true;
        }else{
            System.out.println("Liczba jest nieparzysta");
            return false;
        }

    }
}
