package com.sda.javabyd3.daol.exg006.ex01;

import java.util.ArrayList;
import java.util.List;

public class Hawaiian implements Pizza, Ingredients {

    List<String> listOfIngredients;
    private PizzaDough pizzaDough;

    public Hawaiian() {
        this.listOfIngredients = new ArrayList<>();
        listOfIngredients.add("ser");
        listOfIngredients.add("pieczarki");
        listOfIngredients.add("ananas");
    }

    public Hawaiian(List<String> list, PizzaDough dough) {
        this.listOfIngredients = list;
        listOfIngredients.add("ser");
        listOfIngredients.add("pieczarki");
        listOfIngredients.add("ananas");
        this.pizzaDough = dough;
    }


    @Override
    public void preparePizza() {
        pizzaDough.preparePizzaDough();
        System.out.println("1. Przygotuj ciasto.");
        System.out.println("2. Przygotuj składniki.");
        System.out.println("3. Ułóż składniki na cieście.");
        System.out.println("4. Wsadź pizze do pieca.");
    }

    @Override
    public List<String> getIngredients() {
        return listOfIngredients;
    }
}
