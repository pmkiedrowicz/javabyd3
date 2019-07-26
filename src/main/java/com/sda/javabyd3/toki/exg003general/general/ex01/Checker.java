package com.sda.javabyd3.toki.exg003general.general.ex01;

public class Checker {
    public Boolean checker(int number) {

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even");
            return true;
        } else {
            System.out.println("Number " + number + " is uneven");
            return false;
        }
    }
}