package com.sda.javabyd3.kawa.exg006.interfejsy.ex01;

import com.sda.javabyd3.kawa.exg006.interfejsy.ex01.doughForPizza.AllAmericanThin;
import com.sda.javabyd3.kawa.exg006.interfejsy.ex01.doughForPizza.ChessyBites;
import com.sda.javabyd3.kawa.exg006.interfejsy.ex01.doughForPizza.Pan;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pizza> listOfPizzas = new ArrayList<Pizza>(){{
            add(new Hawaiian(new ChessyBites()));
            add(new Veggie(new AllAmericanThin()));
            add(new Margherita(new Pan()));
        }};

        for (Pizza gimmePizza : listOfPizzas){
            gimmePizza.preparePizza();
            System.out.println(" ");
        }

    }
}
