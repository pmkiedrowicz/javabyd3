package com.sda.javabyd3.jaja.exg006.ex01;


import com.sda.javabyd3.jaja.exg006.ex01.implmentsPizzaDough.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> ingredientList = new ArrayList<>();
        ingredientList.add("ser");
        Margherita margherita = new Margherita();
        Margherita margherita1 = new Margherita(ingredientList, new AllAmericanThin());
        Hawaiian hawaiian = new Hawaiian();
        Hawaiian hawaiian1 = new Hawaiian(ingredientList, new Pan());
        Veggie veggie = new Veggie();
        Veggie veggie1 = new Veggie(ingredientList, new FeelGoodFlatbread());


        List<Pizza> listOfPizza = new ArrayList<>();
        listOfPizza.add(margherita1);
        listOfPizza.add(hawaiian1);
        listOfPizza.add(veggie1);

        for (Pizza pizza : listOfPizza){
            pizza.preparePizza();
            System.out.println(" ");
        }


    }
}
