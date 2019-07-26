package com.sda.javabyd3.daol.exg006.ex01;

import java.util.ArrayList;
import java.util.List;

public class MainPizza {

    public static void main(String[] args) {
        List<String> ingredientsList = new ArrayList<>();
        ingredientsList.add("ketchup");
        Margherita margherita = new Margherita();
        Margherita margherita2 = new Margherita(ingredientsList , new AllAmericanThin());

        Hawaiian hawaiian = new Hawaiian();
        Hawaiian hawaiian1 = new Hawaiian(ingredientsList, new ChessyBites());

        Veggie veggie = new Veggie();
        Veggie veggie1= new Veggie(ingredientsList, new GlutenFree());

        List<Pizza> listOfPizzas = new ArrayList<>();
        listOfPizzas.add(margherita2);
        listOfPizzas.add(hawaiian1);
        listOfPizzas.add(veggie1);

        for (Pizza pizza : listOfPizzas) {
            pizza.preparePizza();
            System.out.println("-----------------");
        }






    }


}
