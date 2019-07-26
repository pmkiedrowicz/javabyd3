package com.sda.javabyd3.urdu.exg006interface.exPizza.pizza;

import com.sda.javabyd3.urdu.exg006interface.exPizza.dough.AllAmericanThin;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Margherita margherita = new Margherita(new AllAmericanThin());

        List<String> myIngredients = new ArrayList<>();
        myIngredients.add("ser");
        myIngredients.add("czosnek");
        myIngredients.add("papryka");
        myIngredients.add("pieczarki");

        Margherita myMargherita = new Margherita(myIngredients, new AllAmericanThin());

        margherita.preparePizza();
        System.out.println("Przygotowanie mojej pizzy: ");
        myMargherita.preparePizza();

       // System.out.println(myMargherita.getIngredients());


    }
}
