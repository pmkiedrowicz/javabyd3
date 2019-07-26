package com.sda.javabyd3.syga.exg006.ex01_06.Pizzaa;

import com.sda.javabyd3.syga.exg006.ex01_06.Dough.AllAmericanThin;
import com.sda.javabyd3.syga.exg006.ex01_06.Dough.ChessyBites;
import com.sda.javabyd3.syga.exg006.ex01_06.Dough.GlutenFree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Pizza> lisOfPizza = new ArrayList<>();
        lisOfPizza.add(new Hawaiian(new AllAmericanThin()));
        lisOfPizza.add(new Margherita(new ChessyBites()));
        lisOfPizza.add(new Veggie(new GlutenFree()));

        for (Pizza pizza: lisOfPizza) {
            pizza.preparePizza();
            System.out.println("----------------------\n");
        }
    }
}
