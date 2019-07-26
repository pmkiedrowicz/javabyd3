package com.sda.javabyd3.mabr.zadania006.InterfPizza;

import com.sda.javabyd3.mabr.zadania006.InterfDough.AllAmericanThin;
import com.sda.javabyd3.mabr.zadania006.InterfDough.ChessyBites;
import com.sda.javabyd3.mabr.zadania006.InterfDough.Pan;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pizza> listOfPizza = new ArrayList<>();
        listOfPizza.add(new Hawaiian(new AllAmericanThin()));
        listOfPizza.add(new Margherita(new ChessyBites()));
        listOfPizza.add(new Veggie(new Pan()));

        for (Pizza pizza : listOfPizza) {
            pizza.preparePizza();
            System.out.println("");
        }
    }
}
