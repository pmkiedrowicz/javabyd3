package com.sda.javabyd3.mizi.exg006.ex1_6.Pizza;

import com.sda.javabyd3.mizi.exg006.ex1_6.Dough.PizzaDough;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal Ziolecki.
 */
public class Margherita implements Pizza, Ingredients{

    private List<String> listOfIngredients;
    PizzaDough pizzaDough;

    public Margherita(PizzaDough dough)
    {
        this.pizzaDough = dough;  // domyslne ciasto
        this.listOfIngredients = new ArrayList<>(  ); //domyslne skladniki
        listOfIngredients.add( "ser" );
        listOfIngredients.add( "pieczarki" );
    }

    public Margherita(List<String> list, PizzaDough dough)
    {
        this.listOfIngredients = list;
        this.pizzaDough = dough;
    }
    @Override
    public void preparePizza() {
        System.out.println("Margarita \n 1. Najpierw ciasto");
        pizzaDough.preparePizzaDough();
        System.out.println("2. Przygotuj skladniki na pizze");
        for(String product : listOfIngredients)
        {
            System.out.println("->" +product);
        }
        System.out.println("3. Uloz je na ciasto");
        System.out.println("4. Piecz");
    }

    @Override
    public List <String> getIngredients() {
        return listOfIngredients;
    }
}
