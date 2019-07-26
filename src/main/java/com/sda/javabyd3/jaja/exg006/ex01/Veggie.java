package com.sda.javabyd3.jaja.exg006.ex01;

import java.util.List;

public class Veggie implements Pizza, Ingredients {

    private List<String> ingredients;
    private PizzaDough pizzaDough;

    public Veggie() {
    }

    public Veggie(List<String> ingredients, PizzaDough dough) {
        this.ingredients = ingredients;
        this.pizzaDough = dough;
    }

    @Override
    public void preparePizza() {
        pizzaDough.preparePizzaDough();
        System.out.println("1.Przygotuj ciasto");
        System.out.println("2.Poukładaj składniki");
        System.out.println("3.Pizza do pieca");
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }
}
