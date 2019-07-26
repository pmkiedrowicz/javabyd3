package com.sda.javabyd3.kawa.exg001.ogolne.ex02;

import java.util.ArrayList;

public class HighestLowestNumbAndSum {

    private int highestOne;
    private int lowestOne;

    public void calculateHighest(ArrayList<Integer> args) {
        for (int i : args) {
            if (highestOne < i) {
                highestOne = i;
            }
        }
        System.out.println("Najwyzsza wprowadzona wartosc liczbowa to " + highestOne);
        lowestOne = highestOne;
    }

    public void calculateLowest(ArrayList<Integer> args) {
        for (int i : args) {
            if (lowestOne > i) {
                lowestOne = i;
            }
        }
        System.out.println("Najnizsza wprowadzona wartosc liczbowa to " + lowestOne);
    }

    private int sumedNumbs;

    public void sumAllNumbs (ArrayList<Integer> args) {
        for (int i : args){
            sumedNumbs+=i;
        }
        System.out.println("Suma wszystkich wprowadzonych liczb wynosi " + sumedNumbs);
    }

}
