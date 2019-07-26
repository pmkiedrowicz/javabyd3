package com.sda.javabyd3.mabr.zadania006.InterfPizza;

import com.sda.javabyd3.mabr.zadania006.InterfDough.PizzaDough;

import java.util.ArrayList;
import java.util.List;

public class Margherita implements Pizza, Ingredients {

    private List<String> listOfIngredients;
    PizzaDough pizzaDough;

    public Margherita(PizzaDough dough) {
        this.pizzaDough = dough;  // domyslne ciasto
        this.listOfIngredients = new ArrayList<>(); //domyslne skladniki
        listOfIngredients.add("cheese");
        listOfIngredients.add("mushrooms");
    }

    public Margherita(List<String> list, PizzaDough dough) {
        this.listOfIngredients = list;
        this.pizzaDough = dough;
    }

    @Override
    public void preparePizza() {
        System.out.println("Margherita \n 1. Dough");
        pizzaDough.preparePizzaDough();
        System.out.println("2. Prepare ingredients");
        for (String product : listOfIngredients) {
            System.out.println("->" + product);
        }
        System.out.println("3. Put on dough");
        System.out.println("4. Bake");
    }

    @Override
    public List<String> getIngredients() {
        return listOfIngredients;
    }
}
